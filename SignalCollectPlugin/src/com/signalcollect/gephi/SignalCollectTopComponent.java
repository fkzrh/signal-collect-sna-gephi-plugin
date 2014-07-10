/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.signalcollect.gephi;

import ch.uzh.ifi.ddis.signalcollect.DegreeVertex;
import com.signalcollect.AbstractVertex;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.NbBundle.Messages;
import org.openide.util.lookup.ServiceProvider;
import org.openide.windows.TopComponent;

@ConvertAsProperties(
        dtd = "-//com.signalcollect.gephi//SignalCollect//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "SignalCollectTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "contextmode", openAtStartup = true)
@ActionID(category = "Window", id = "com.signalcollect.gephi.SignalCollectTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_SignalCollectAction",
        preferredID = "SignalCollectTopComponent"
)
@Messages({
    "CTL_SignalCollectAction=SignalCollect",
    "CTL_SignalCollectTopComponent=SignalCollect Window",
    "HINT_SignalCollectTopComponent=This is a SignalCollect window"
})
public final class SignalCollectTopComponent extends TopComponent {

    public SignalCollectTopComponent() {
        initComponents();

        setName(Bundle.CTL_SignalCollectTopComponent());
        setToolTipText(Bundle.HINT_SignalCollectTopComponent());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        runMetric = new java.awt.Button();

        runMetric.setLabel(org.openide.util.NbBundle.getMessage(SignalCollectTopComponent.class, "SignalCollectTopComponent.runMetric.label")); // NOI18N
        runMetric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runMetricActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(runMetric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(runMetric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void runMetricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runMetricActionPerformed
        JButton btn = new JButton();
        btn.setText("Hello,im a new button");
        btn.setSize(50, 20);
        btn.setLocation(10, 10);
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                ch.uzh.ifi.ddis.signalcollect.DegreeVertex dv = new DegreeVertex(1, 1);
                JFrame jf = new JFrame();
                JLabel jl = new JLabel();
                jl.setText(dv.id().toString());
                jf.add(jl);
            }
        });
        JFrame f = new JFrame();
        f.setSize(600, 300);
        f.setLocation(200, 100);
        f.add(btn);
        f.setVisible(true);

    }//GEN-LAST:event_runMetricActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button runMetric;
    // End of variables declaration//GEN-END:variables

    @Override
    public void componentOpened() {

        runMetric.setLabel("Run a Signal/Collect Metric");
        runMetric.setName("Run a Signal/Collect Metric");

    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

}
