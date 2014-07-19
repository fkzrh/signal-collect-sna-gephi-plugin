/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.signalcollect.sna.visualization;

import com.signalcollect.sna.DegreeSignalCollectGephiConnectorImpl;
import com.signalcollect.sna.PageRankSignalCollectGephiConnectorImpl;
import com.signalcollect.sna.SignalCollectGephiConnector;
import java.util.Map;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//com.signalcollect.sna.visualization//SignalCollectSNA//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "SignalCollectSNATopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "contextmode", openAtStartup = true)
@ActionID(category = "Window", id = "com.signalcollect.sna.visualization.SignalCollectSNATopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_SignalCollectSNAAction",
        preferredID = "SignalCollectSNATopComponent"
)
@Messages({
    "CTL_SignalCollectSNAAction=SignalCollectSNA",
    "CTL_SignalCollectSNATopComponent=SignalCollectSNA Window",
    "HINT_SignalCollectSNATopComponent=This is a SignalCollectSNA window"
})
public final class SignalCollectSNATopComponent extends TopComponent {

    public SignalCollectSNATopComponent() {
        initComponents();
        setName(Bundle.CTL_SignalCollectSNATopComponent());
        setToolTipText(Bundle.HINT_SignalCollectSNATopComponent());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        metricDropDown = new javax.swing.JComboBox();
        runMetricButton = new javax.swing.JButton();
        SCScrollPane = new javax.swing.JScrollPane();
        SCText = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        propertiesDropdown = new javax.swing.JComboBox();
        propertyButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setAutoscrolls(true);
        setMaximumSize(new java.awt.Dimension(600, 700));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        metricDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Degree", "PageRank", "Betweenness" }));
        metricDropDown.setAutoscrolls(true);
        metricDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metricDropDownActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 3.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 15, 10, 15);
        jPanel1.add(metricDropDown, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(runMetricButton, org.openide.util.NbBundle.getMessage(SignalCollectSNATopComponent.class, "SignalCollectSNATopComponent.runMetricButton.text")); // NOI18N
        runMetricButton.setAutoscrolls(true);
        runMetricButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runMetricButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 15, 10, 15);
        jPanel1.add(runMetricButton, gridBagConstraints);

        SCText.setColumns(20);
        SCText.setRows(5);
        SCScrollPane.setViewportView(SCText);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 395;
        gridBagConstraints.ipady = 177;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 10, 6);
        jPanel1.add(SCScrollPane, gridBagConstraints);

        add(jPanel1, new java.awt.GridBagConstraints());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        propertiesDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Graph Size", "Other Property" }));
        propertiesDropdown.setAutoscrolls(true);
        propertiesDropdown.setMinimumSize(new java.awt.Dimension(20, 27));
        propertiesDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertiesDropdownActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 3.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 15, 10, 15);
        jPanel2.add(propertiesDropdown, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(propertyButton, org.openide.util.NbBundle.getMessage(SignalCollectSNATopComponent.class, "SignalCollectSNATopComponent.propertyButton.text")); // NOI18N
        propertyButton.setAutoscrolls(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 15, 10, 15);
        jPanel2.add(propertyButton, gridBagConstraints);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 395;
        gridBagConstraints.ipady = 177;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        jScrollPane2.setViewportView(jTextPane1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel2.add(jScrollPane2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        add(jPanel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void runMetricButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runMetricButtonActionPerformed
       SignalCollectGephiConnector scgc;
       SCText.setText("loading...");
       String actualMetric = metricDropDown.getSelectedItem().toString();
       if(actualMetric.equals("Degree")){
           scgc = new DegreeSignalCollectGephiConnectorImpl();
           scgc.executeGraph();
           SCText.setText(setMetricText(scgc.getAverage(), scgc.getAll()));
       }
       else if(actualMetric.equals("PageRank")){
           scgc = new PageRankSignalCollectGephiConnectorImpl();
           scgc.executeGraph();
           jTextPane1.setText(setMetricText(scgc.getAverage(), scgc.getAll()));
//           SCText.setText(setMetricText(scgc.getAverage(), scgc.getAll()));
       }
    }//GEN-LAST:event_runMetricButtonActionPerformed

    private void propertiesDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertiesDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_propertiesDropdownActionPerformed

    private void metricDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metricDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metricDropDownActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane SCScrollPane;
    private javax.swing.JTextArea SCText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JComboBox metricDropDown;
    private javax.swing.JComboBox propertiesDropdown;
    private javax.swing.JButton propertyButton;
    private javax.swing.JButton runMetricButton;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
   
    }

    @Override
    public void componentClosed() {
        
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
    
    private String setMetricText(double avg, Map<String, Object> vertexMap) {
        String res = "The average value of the vertices is: " + avg + "\n \n The single vertex values are:\n \n";
        for (Map.Entry<String, Object> entry : vertexMap.entrySet()) {
            res += "Vertex id: " + entry.getKey() + ", Value: " + entry.getValue() + "\n";
        }
        return res;
    }
}
