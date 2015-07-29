/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.googletoolbar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "org.myorg.googletoolbar.GoogleActionListener"
)
@ActionRegistration(
        iconBase = "org/myorg/googletoolbar/google.png",
        displayName = "#CTL_GoogleActionListener"
)
@ActionReference(path = "Toolbars/File", position = 0)
@Messages("CTL_GoogleActionListener=Google")
public final class GoogleActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
