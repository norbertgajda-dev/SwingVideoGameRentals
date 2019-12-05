package gui;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import model.DbModel;
import model.Game;
import model.Member;

/**
 *
 * @author GAJDA NORBERT
 */
public class RentDialog extends javax.swing.JDialog {

    private DbModel model;
    private Game game;
    private List<Member> members;
    private Map<Integer, Member> membersMap;

    public RentDialog(java.awt.Dialog parent, DbModel model, Game game) {
        super(parent, true);
        initComponents();
        setTitle("Rent");
        setLocationRelativeTo(parent);

        this.model = model;
        this.game = game;
        lblSelected.setText(game.getName());

        try {
            members = model.getAllMembers();
            membersMap = model.getMapMembers();
            lstMembers.setListData(members.toArray());
            setSelectedValue();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "Database ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRent = new javax.swing.JButton();
        lblSelected = new javax.swing.JLabel();
        tfSearchMember = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstMembers = new javax.swing.JList();
        btnOK = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstGames = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnRent.setBackground(new java.awt.Color(102, 102, 102));
        btnRent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRent.setForeground(new java.awt.Color(204, 204, 204));
        btnRent.setText("Rent");
        btnRent.setBorder(null);
        btnRent.setBorderPainted(false);
        btnRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentActionPerformed(evt);
            }
        });

        lblSelected.setBackground(new java.awt.Color(102, 102, 102));
        lblSelected.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblSelected.setForeground(new java.awt.Color(204, 204, 204));
        lblSelected.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tfSearchMember.setBackground(new java.awt.Color(102, 102, 102));
        tfSearchMember.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfSearchMember.setForeground(new java.awt.Color(204, 204, 204));
        tfSearchMember.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchMemberKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Search: ");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Selected game:");

        lstMembers.setBackground(new java.awt.Color(102, 102, 102));
        lstMembers.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lstMembers.setForeground(new java.awt.Color(204, 204, 204));
        lstMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lstMembersMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(lstMembers);

        btnOK.setBackground(new java.awt.Color(102, 102, 102));
        btnOK.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnOK.setForeground(new java.awt.Color(204, 204, 204));
        btnOK.setText("OK");
        btnOK.setBorder(null);
        btnOK.setBorderPainted(false);
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        lstGames.setBackground(new java.awt.Color(102, 102, 102));
        lstGames.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lstGames.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(lstGames);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRent, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(btnOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfSearchMember)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSearchMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentActionPerformed
        if (btnRent.getText().equals("Rent")) {

            long ms = System.currentTimeMillis();
            java.sql.Date date = new java.sql.Date(ms);

            Member m = (Member) lstMembers.getSelectedValue();
            game.setMembers_id(m.getId());
            game.setRental_date(date.toString());
            btnRent.setEnabled(false);
            try {
                model.updateGames(game);
                lstMembersMousePressed(null);
                JOptionPane.showMessageDialog(rootPane, game.getName() + " was successfully rented! The fee is 3 euro!", "Successful rent!", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.toString(), "Database ERROR!", JOptionPane.ERROR_MESSAGE);
            }

        } else {

            long ms = System.currentTimeMillis();
            java.sql.Date date = new java.sql.Date(ms);

            //parse String Date to Date format
            String dbDate = game.getRental_date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date parseDate;
            java.sql.Date rentedDate;
            try {
                parseDate = sdf.parse(dbDate);
                rentedDate = new java.sql.Date(parseDate.getTime());
                long days = (date.getTime() - rentedDate.getTime()) / 1000 / 60 / 60 / 24;

                if (days <= 3) {
                    JOptionPane.showMessageDialog(rootPane, "Returned in " + days + " days! You dont have to pay overdue fine!", "Thank You!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Returned in " + days + " days! You have to pay " + overdueFine(days) + " euro(s) overdue fine!", "Thank You!", JOptionPane.INFORMATION_MESSAGE);
                }
                game.setMembers_id(0);
                model.updateGames(game);
                lstMembersMousePressed(null);
                btnRent.setEnabled(false);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.toString(), "Something went wrong with the date parsing", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.toString(), "Database ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnRentActionPerformed

    private void lstMembersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstMembersMousePressed
        Member member = (Member) lstMembers.getSelectedValue();
        try {
            List<Game> memberGames = model.getMemberGames(member);
            if (memberGames != null) {
                lstGames.setListData(memberGames.toArray());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "Database ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lstMembersMousePressed

    private void tfSearchMemberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchMemberKeyReleased
        String searchString = tfSearchMember.getText();
        List<Member> sMember = new ArrayList<>();
        for (Member member : members) {
            if (member.getName().contains(searchString)) {
                sMember.add(member);
            }
        }
        if (sMember!= null) {
            lstMembers.setListData(sMember.toArray());
        } else {
            members.add(new Member("-", "-", "-"));
            lstMembers.setListData(sMember.toArray());

        }
    }//GEN-LAST:event_tfSearchMemberKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnRent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblSelected;
    private javax.swing.JList lstGames;
    private javax.swing.JList lstMembers;
    private javax.swing.JTextField tfSearchMember;
    // End of variables declaration//GEN-END:variables

    private void setSelectedValue() {
        int indexOfSelectedValue = -1;
        if (game.getMembers_id() != 0) {
            btnRent.setText("Return");
            for (int i = 0; i < members.size(); i++) {
                if (members.get(i).getName().equals(membersMap.get(game.getMembers_id()).getName())) {
                    indexOfSelectedValue = i;
                }
            }
            lstMembers.setSelectedValue(members.get(indexOfSelectedValue), true);
            lstMembersMousePressed(null);
        } else {
            btnRent.setText("Rent");
            lstMembers.setSelectedIndex(0);
            lstMembersMousePressed(null);
        }
    }

    private long overdueFine(long days) {
        long fee = 0;
        if (days > 3) {
            fee = (days - 3) * 2;
        }
        return fee;
    }

}
