/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.utils.gui.fancytab;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author AAR1069
 */
class TabbedPaneStateChangeListener implements ChangeListener {
    
    private final FancyTabbedPane pane;

    TabbedPaneStateChangeListener(final FancyTabbedPane outer) {
        this.pane = outer;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int s = pane.getSelectedIndex();
        for (int i = 0; i < pane.getTabCount(); i++) {
            FancyTabTitlePanel p = (FancyTabTitlePanel) pane.getTabComponentAt(i);
            p.setForeground(i == s ? pane.getActiveColor() : pane.getInactiveColor());
        }
    }
    
}
