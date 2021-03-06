/*
 * FancyTabTitlePanel.java
 *
 * Created on January 26, 2007, 2:46 PM
 */
 
package com.blazartech.utils.gui.fancytab;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * A panel to display a tab label.
 *
 * @author  Dr. Scott E. Aaron
 * @version $Id: FancyTabTitlePanel.java 36 2015-04-23 19:56:54Z aar1069 $
 */

/* $Log: FancyTabTitlePanel.java,v $
/* Revision 1.3  2007/08/03 15:33:07  aar1069
/* If the foreground changes, update the foreground on the label.
/*
/* Revision 1.2  2007/06/28 19:07:21  aar1069
/* Added the confirmClose property; if this is set to true, the user will be asked to confirm the tab should be closed.
/*
 *******************************************************************************/

class FancyTabTitlePanel extends JPanel {
    
    /** Creates new form FancyTabTitlePanel */
    public FancyTabTitlePanel() {
        initComponents();
        add(_tabCloseButton);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _titleLabel = new javax.swing.JLabel();

        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 3, 0));
        add(_titleLabel);
    }// </editor-fold>//GEN-END:initComponents

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        switch (evt.getPropertyName()) {
            case "tabbedPane":
                _tabCloseButton.setTabbedPane(getTabbedPane());
                break;
            case "title":
                _titleLabel.setText(getTitle());
                break;
            case "confirmClose":
                updateConfirmClose(); 
                break;
            case "foreground":
                _titleLabel.setForeground(getForeground());
                break;
            default:
                break;
        }
    }//GEN-LAST:event_formPropertyChange
    
    private void updateConfirmClose() {
        _tabCloseButton.setConfirmClose(isConfirmClose());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel _titleLabel;
    // End of variables declaration//GEN-END:variables

    /**
     * Holds value of property tabbedPane.
     */
    private JTabbedPane tabbedPane;

    /**
     * Getter for property tabbedPane.
     * @return Value of property tabbedPane.
     */
    public JTabbedPane getTabbedPane() {
        return this.tabbedPane;
    }

    /**
     * Setter for property tabbedPane.
     * @param tabbedPane New value of property tabbedPane.
     */
    public void setTabbedPane(JTabbedPane tabbedPane) {
        JTabbedPane oldTabbedPane = this.tabbedPane;
        this.tabbedPane = tabbedPane;
        firePropertyChange ("tabbedPane", oldTabbedPane, tabbedPane);
    }

    /**
     * Holds value of property title.
     */
    private String title;

    /**
     * Getter for property title.
     * @return Value of property title.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for property title.
     * @param title New value of property title.
     */
    public void setTitle(String title) {
        String oldTitle = this.title;
        this.title = title;
        firePropertyChange ("title", oldTitle, title);
    }

    /**
     * Holds value of property confirmClose.
     */
    private boolean confirmClose;

    /**
     * Getter for property confirmClose.
     * @return Value of property confirmClose.
     */
    public boolean isConfirmClose() {
        return this.confirmClose;
    }

    /**
     * Setter for property confirmClose.
     * @param confirmClose New value of property confirmClose.
     */
    public void setConfirmClose(boolean confirmClose) {
        boolean oldConfirmClose = this.confirmClose;
        this.confirmClose = confirmClose;
        firePropertyChange ("confirmClose", oldConfirmClose, confirmClose);
    }
    
    private TabCloseButton _tabCloseButton = new TabCloseButton();
}
