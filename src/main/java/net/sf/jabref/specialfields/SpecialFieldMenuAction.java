package net.sf.jabref.specialfields;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import net.sf.jabref.gui.JabRefFrame;

public class SpecialFieldMenuAction extends AbstractAction {

    private final JabRefFrame frame;
    private final String actionName;


    public SpecialFieldMenuAction(SpecialFieldValue val, JabRefFrame frame) {
        super(val.getMenuString(), val.getIcon());
        this.frame = frame;
        this.actionName = val.getActionName();
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if (frame.getCurrentBasePanel() != null) {
            frame.getCurrentBasePanel().runCommand(actionName);
        }
    }
}
