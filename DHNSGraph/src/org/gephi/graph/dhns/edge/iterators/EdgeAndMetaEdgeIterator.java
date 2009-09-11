/*
Copyright 2008 WebAtlas
Authors : Mathieu Bastian, Mathieu Jacomy, Julian Bilcke
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.graph.dhns.edge.iterators;

import java.util.Iterator;
import org.gephi.graph.dhns.core.TreeStructure;
import org.gephi.datastructure.avl.param.ParamAVLIterator;
import org.gephi.graph.api.Edge;
import org.gephi.graph.dhns.edge.AbstractEdge;
import org.gephi.graph.dhns.edge.MetaEdgeImpl;
import org.gephi.graph.dhns.node.AbstractNode;
import org.gephi.graph.dhns.node.iterators.AbstractNodeIterator;
import org.gephi.graph.dhns.proposition.Proposition;
import org.gephi.graph.dhns.proposition.Tautology;
import org.gephi.graph.dhns.view.View;

/**
 * Iterator for meta edges for the visible graph.
 *
 * @author Mathieu Bastian
 * @see EdgeIterator
 */
public class EdgeAndMetaEdgeIterator extends AbstractEdgeIterator implements Iterator<Edge> {

    protected AbstractNodeIterator nodeIterator;
    protected ParamAVLIterator<MetaEdgeImpl> edgeIterator;
    protected AbstractNode currentNode;
    protected AbstractEdge pointer;
    protected boolean undirected;
    protected View view;
    protected boolean metaEdge = false;

    //Proposition
    protected Proposition<AbstractEdge> proposition;

    public EdgeAndMetaEdgeIterator(View view, TreeStructure treeStructure, AbstractNodeIterator nodeIterator, boolean undirected, Proposition<AbstractEdge> proposition) {
        this.nodeIterator = nodeIterator;
        this.view = view;
        edgeIterator = new ParamAVLIterator<MetaEdgeImpl>();
        this.undirected = undirected;
        if (proposition == null) {
            this.proposition = new Tautology();
        } else {
            this.proposition = proposition;
        }
    }

    @Override
    public boolean hasNext() {
        while (pointer == null || (undirected && ((metaEdge && ((MetaEdgeImpl) pointer).getUndirected(view) != pointer) || (!metaEdge && pointer.getUndirected() != pointer))) || !proposition.evaluate(pointer)) {
            while (!edgeIterator.hasNext()) {
                if (currentNode != null && !metaEdge) {
                    metaEdge = true;
                    if (!currentNode.getMetaEdgesOutTree(view).isEmpty()) {
                        edgeIterator.setNode(currentNode.getMetaEdgesOutTree(view));
                    }
                } else if (nodeIterator.hasNext()) {
                    currentNode = nodeIterator.next();
                    if (!currentNode.getEdgesOutTree().isEmpty()) {
                        edgeIterator.setNode(currentNode.getEdgesOutTree());
                    }
                    metaEdge = false;
                } else {
                    return false;
                }
            }

            pointer = edgeIterator.next();
        }
        return true;
    }

    @Override
    public AbstractEdge next() {
        AbstractEdge e = pointer;
        pointer = null;
        return e;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}