/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.signalcollect.sna.visualization;

import com.signalcollect.sna.GraphProperties;
import com.signalcollect.sna.gephiconnectors.BetweennessSignalCollectGephiConnectorImpl;
import com.signalcollect.sna.gephiconnectors.ClosenessSignalCollectGephiConnectorImpl;
import com.signalcollect.sna.gephiconnectors.DegreeSignalCollectGephiConnectorImpl;
import com.signalcollect.sna.gephiconnectors.PageRankSignalCollectGephiConnectorImpl;
import com.signalcollect.sna.gephiconnectors.SignalCollectGephiConnector;
import java.awt.Cursor;
import java.awt.Dimension;
import java.io.IOException;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.Exceptions;
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

    private SignalCollectGephiConnector scgc;
    private String fileName;

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

        metricResultFrame = new javax.swing.JFrame();
        metricValuesScrollPane = new javax.swing.JScrollPane(metricValuesTextPane);
        metricValuesTextPane = new javax.swing.JTextPane();
        degreeDistributionFrame = new javax.swing.JFrame();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        propertyPanel = new javax.swing.JPanel();
        propertyButton = new javax.swing.JButton();
        degreeDistributionButton = new javax.swing.JButton();
        propertyInfo = new javax.swing.JLabel();
        propertyDisplay = new javax.swing.JScrollPane();
        propertyContentDisplay = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();
        infoPanel = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        fileChooserButton = new javax.swing.JButton();
        filePathScrollPane = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        metricPanel = new javax.swing.JPanel();
        metricDropDown = new javax.swing.JComboBox();
        runMetricButton = new javax.swing.JButton();
        infoTextLabel = new javax.swing.JLabel();

        metricValuesTextPane.setContentType("text/html");
        metricValuesTextPane.setFocusable(false);
        metricValuesTextPane.setMargin(new java.awt.Insets(20, 20, 20, 20));
        metricResultFrame.getContentPane().add(metricValuesTextPane, java.awt.BorderLayout.CENTER);
        metricValuesScrollPane.setViewportView(metricValuesTextPane);

        metricResultFrame.getContentPane().add(metricValuesScrollPane, java.awt.BorderLayout.PAGE_START);

        metricResultFrame.setContentPane(metricValuesScrollPane);
        metricResultFrame.setLocation(50, 50);

        degreeDistributionFrame.setLocation(50, 50);

        jFrame1.getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setAutoscrolls(true);
        setLayout(new java.awt.GridBagLayout());

        mainPanel.setBackground(new java.awt.Color(100, 150, 255));
        mainPanel.setLayout(new java.awt.GridBagLayout());

        propertyPanel.setBackground(new java.awt.Color(100, 150, 255));
        propertyPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(102, 102, 102)));
        propertyPanel.setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(propertyButton, org.openide.util.NbBundle.getMessage(SignalCollectSNATopComponent.class, "SignalCollectSNATopComponent.propertyButton.text")); // NOI18N
        propertyButton.setAutoscrolls(true);
        propertyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertyButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 15);
        propertyPanel.add(propertyButton, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(degreeDistributionButton, org.openide.util.NbBundle.getMessage(SignalCollectSNATopComponent.class, "SignalCollectSNATopComponent.degreeDistributionButton.text")); // NOI18N
        degreeDistributionButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        degreeDistributionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeDistributionButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 15);
        propertyPanel.add(degreeDistributionButton, gridBagConstraints);

        propertyInfo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(propertyInfo, org.openide.util.NbBundle.getMessage(SignalCollectSNATopComponent.class, "SignalCollectSNATopComponent.propertyInfo.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 15);
        propertyPanel.add(propertyInfo, gridBagConstraints);

        propertyContentDisplay.setEditable(false);

        propertyContentDisplay.setContentType("text/html"); // NOI18N

        propertyContentDisplay.setFocusable(false);
        propertyDisplay.setViewportView(propertyContentDisplay);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weighty = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        propertyPanel.add(propertyDisplay, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(SignalCollectSNATopComponent.class, "SignalCollectSNATopComponent.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        propertyPanel.add(jButton1, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        mainPanel.add(propertyPanel, gridBagConstraints);

        infoPanel.setBackground(new java.awt.Color(100, 150, 255));
        infoPanel.setLayout(new java.awt.GridBagLayout());

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sc-logo-white-bg_200px.png")));
        org.openide.awt.Mnemonics.setLocalizedText(imageLabel, org.openide.util.NbBundle.getMessage(SignalCollectSNATopComponent.class, "SignalCollectSNATopComponent.imageLabel.text")); // NOI18N
        imageLabel.setToolTipText(org.openide.util.NbBundle.getMessage(SignalCollectSNATopComponent.class, "SignalCollectSNATopComponent.imageLabel.toolTipText")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 15);
        infoPanel.add(imageLabel, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(fileChooserButton, org.openide.util.NbBundle.getMessage(SignalCollectSNATopComponent.class, "SignalCollectSNATopComponent.fileChooserButton.text")); // NOI18N
        fileChooserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 15);
        infoPanel.add(fileChooserButton, gridBagConstraints);

        filePathScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        filePathScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(1);
        filePathScrollPane.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 15);
        infoPanel.add(filePathScrollPane, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(infoPanel, gridBagConstraints);

        metricPanel.setBackground(new java.awt.Color(100, 150, 255));
        metricPanel.setLayout(new java.awt.GridBagLayout());

        metricDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Degree", "PageRank", "Closeness","Betweenness" }));
        metricDropDown.setAutoscrolls(true);
        metricDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metricDropDownActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 15);
        metricPanel.add(metricDropDown, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(runMetricButton, org.openide.util.NbBundle.getMessage(SignalCollectSNATopComponent.class, "SignalCollectSNATopComponent.runMetricButton.text")); // NOI18N
        runMetricButton.setAutoscrolls(true);
        runMetricButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runMetricButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 4.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 15);
        metricPanel.add(runMetricButton, gridBagConstraints);

        infoTextLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(infoTextLabel, org.openide.util.NbBundle.getMessage(SignalCollectSNATopComponent.class, "SignalCollectSNATopComponent.infoTextLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 15);
        metricPanel.add(infoTextLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(metricPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(mainPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void runMetricButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runMetricButtonActionPerformed
        try {
            mainPanel.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            if (jTextArea1.getText() == null) {
                throw new IllegalArgumentException("No file was chosen!\nPlease choose a valid .gml file");
            }
            if (!jTextArea1.getText().contains(".gml")) {
                throw new IllegalArgumentException("The chosen file doesn't have the right format!\nPlease choose a valid .gml file");
            }
            String actualMetric = metricDropDown.getSelectedItem().toString();
            if (actualMetric.equals("Degree")) {
                scgc = new DegreeSignalCollectGephiConnectorImpl(fileName);
                scgc.executeGraph();
                metricValuesTextPane.setText(setMetricText(scgc.getAverage(), scgc.getAll()));
            } else if (actualMetric.equals("PageRank")) {
                scgc = new PageRankSignalCollectGephiConnectorImpl(fileName);
                scgc.executeGraph();
                metricValuesTextPane.setText(setMetricText(scgc.getAverage(), scgc.getAll()));
            } else if (actualMetric.equals("Betweenness")) {
                scgc = new BetweennessSignalCollectGephiConnectorImpl(fileName);
                scgc.executeGraph();
                metricValuesTextPane.setText(setMetricText(scgc.getAverage(), scgc.getAll()));
            } else if (actualMetric.equals("Closeness")) {
                scgc = new ClosenessSignalCollectGephiConnectorImpl(fileName);
                scgc.executeGraph();

                metricValuesTextPane.setText(setMetricText(scgc.getAverage(), scgc.getAll()));
            } else {
                throw new IllegalArgumentException("invalid Signal/Collect metric chosen!\nPlease try again");
            }
            Dimension dim = new Dimension(750, 450);
            metricResultFrame.setMinimumSize(dim);
            metricResultFrame.pack();
            metricValuesTextPane.setVisible(true);
            metricValuesScrollPane.setVisible(true);
            metricResultFrame.setVisible(true);
        } catch (Exception exception) {
            JFrame messageFrame = new JFrame();
            String exceptionMessage = "";
            if (exception instanceof IllegalArgumentException) {
                exceptionMessage = exception.getMessage();
            } else {
                exceptionMessage = "Fatal technical exception happened (" + exception.getCause() + ")";
            }
            JOptionPane.showMessageDialog(messageFrame,
                    exceptionMessage,
                    "Signal/Collect Error",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            mainPanel.setCursor(Cursor.getDefaultCursor());
        }
    }//GEN-LAST:event_runMetricButtonActionPerformed

    private void metricDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metricDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metricDropDownActionPerformed

    private void propertyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertyButtonActionPerformed
        try {
            mainPanel.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            if (jTextArea1.getText() == null) {
                throw new IllegalArgumentException("No file was chosen!\nPlease choose a valid .gml file");
            }
            if (!jTextArea1.getText().contains(".gml")) {
                throw new IllegalArgumentException("The chosen file doesn't have the right format!\nPlease choose a valid .gml file");
            }
            if (scgc == null) {
                scgc = new DegreeSignalCollectGephiConnectorImpl(fileName);
            }
            propertyContentDisplay.setText(setPropertyText(scgc.getGraphProperties()));
        } catch (Exception exception) {
            JFrame messageFrame = new JFrame();
            String exceptionMessage = "";
            if (exception instanceof IllegalArgumentException) {
                exceptionMessage = exception.getMessage();
            } else {
                exceptionMessage = "Fatal technical exception happened (" + exception.getCause() + ")";
            }
            JOptionPane.showMessageDialog(messageFrame,
                    exceptionMessage,
                    "Signal/Collect Error",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            mainPanel.setCursor(Cursor.getDefaultCursor());
        }
    }//GEN-LAST:event_propertyButtonActionPerformed

    private void degreeDistributionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeDistributionButtonActionPerformed
        try {
            mainPanel.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            if (jTextArea1.getText() == null) {
                throw new IllegalArgumentException("No file was chosen!\nPlease choose a valid .gml file");
            }
            if (!jTextArea1.getText().contains(".gml")) {
                throw new IllegalArgumentException("The chosen file doesn't have the right format!\nPlease choose a valid .gml file");
            }
            scgc = new DegreeSignalCollectGephiConnectorImpl(fileName);
            JFreeChart chart = scgc.createDegreeDistributionImageFile(scgc.getDegreeDistribution(),"DegreeDistribution.png");
            ChartPanel chartPanel = new ChartPanel(chart);
            Dimension dim = new Dimension(750, 450);
            degreeDistributionFrame.setMinimumSize(dim);
            degreeDistributionFrame.add(chartPanel);

            degreeDistributionFrame.pack();
            degreeDistributionFrame.setVisible(true);
        } catch (Exception exception) {
            JFrame messageFrame = new JFrame();
            String exceptionMessage = "";
            if (exception instanceof IllegalArgumentException) {
                exceptionMessage = exception.getMessage();
            } else {
                exceptionMessage = "Fatal technical exception happened (" + exception.getCause() + ")";
            }
            JOptionPane.showMessageDialog(messageFrame,
                    exceptionMessage,
                    "Signal/Collect Error",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            mainPanel.setCursor(Cursor.getDefaultCursor());
        }
    }//GEN-LAST:event_degreeDistributionButtonActionPerformed

    private void fileChooserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserButtonActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Graph Files", "gml");
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        if (chooser.getSelectedFile() != null) {
            fileName = chooser.getSelectedFile().getAbsolutePath();
            jTextArea1.setText(fileName);
//            filePathTextPane.setText(fileName);
        }
    }//GEN-LAST:event_fileChooserButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton degreeDistributionButton;
    private javax.swing.JFrame degreeDistributionFrame;
    private javax.swing.JButton fileChooserButton;
    private javax.swing.JScrollPane filePathScrollPane;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel infoTextLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox metricDropDown;
    private javax.swing.JPanel metricPanel;
    private javax.swing.JFrame metricResultFrame;
    private javax.swing.JScrollPane metricValuesScrollPane;
    private javax.swing.JTextPane metricValuesTextPane;
    private javax.swing.JButton propertyButton;
    private javax.swing.JEditorPane propertyContentDisplay;
    private javax.swing.JScrollPane propertyDisplay;
    private javax.swing.JLabel propertyInfo;
    private javax.swing.JPanel propertyPanel;
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
        String res = "<!doctype html><html><head><title>Execution Results</title><style type=\"text/css\"></style>"
                + "</head>"
                + "<body>"
                + "<h1><span style=\"font-family:verdana,geneva,sans-serif;font-size:12px;font-weight:normal\">Execution Results</span></h1>"
                + "<h2><span style=\"font-family:verdana,geneva,sans-serif;font-size:11px;font-weight:normal;\">Average: </span></h2>\n"
                + "<p><span style=\"font-family:verdana,geneva,sans-serif;font-size:10px;\">The average value of the vertices is:&nbsp;" + avg + "</span></p><ul>"
                + "<h2><span style=\"font-family:verdana,geneva,sans-serif;font-size:11px;font-weight:normal;\">Single Values:</span></h2>";
        for (Map.Entry<String, Object> entry : vertexMap.entrySet()) {
            res += "<li><span style=\"font-family:verdana,geneva,sans-serif;font-size:10px;\">Vertex id:&nbsp;" + entry.getKey() + "&emsp;Value: " + entry.getValue() + "</span></li>";
        }

        res += "</ul><p>&nbsp;</p></body></html>";

        return res;
    }

    private String setPropertyText(GraphProperties props) {
        String res = "<!doctype html><html><head><title>Graph Properties</title>"
                + "<style type=\"text/css\">"
                + "table.tablestyle {border-collapse:collapse}"
                + "table.tablestyle td {border: 2px solid #000000; font-family:verdana,geneva,sans-serif;font-size:10px;font-weight:normal;}"
                + "table.tablestyle th {border: 2px solid #000000; font-family:verdana,geneva,sans-serif;font-size:11px;font-weight:normal;}"
                + "</style>"
                + "</head>"
                + "<body>"
                + "<table class = \"tablestyle\">"
                + "<tr><th>Property</th><th>Value</th></tr>"
                + "<tr><td>Size</td><td>" + props.calcSize() + "</td></tr>"
                + "<tr><td>Density</td><td>" + props.calcDensity() + "</td></tr>"
                + "<tr><td>Diameter</td><td>" + props.calcDiameter() + "</td></tr>"
                + "<tr><td>Reciprocity</td><td>" + props.calcReciprocity() + "</td></tr>"
                + "</table></body></html>";

        return res;
    }

}