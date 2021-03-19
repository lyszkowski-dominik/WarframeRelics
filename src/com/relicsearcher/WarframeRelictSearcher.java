package com.relicsearcher;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class WarframeRelictSearcher {
    private JPanel MainPanel;
    private JButton searchButton;
    private JList componentList;

    public WarframeRelictSearcher() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        RelictWarehouse relictWarehouse = new RelictWarehouse();
        JFrame frame = new JFrame("Warframe Relict Searcher");
        frame.setContentPane(new WarframeRelictSearcher().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultListModel<String> model = new DefaultListModel<>();
        model.addElement(relictWarehouse.relictList.get(0).getB1());
        model.addElement(relictWarehouse.relictList.get(0).getB2());
        model.addElement(relictWarehouse.relictList.get(0).getB3());
        JList componentList = new JList();

        frame.pack();
        frame.setVisible(true);
    }
}
