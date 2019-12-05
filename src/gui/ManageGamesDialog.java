package gui;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import model.DbModel;
import model.Game;
import model.Member;

/**
 *
 * @author GAJDA NORBERT
 */
public class ManageGamesDialog extends javax.swing.JDialog implements TableModelListener {

    private DbModel model;
    private List<Game> games;
    private DefaultTableModel dtm;
    private String searchString = "";
    private boolean isSearch = false;

    public ManageGamesDialog(java.awt.Dialog parent, DbModel model) {
        super(parent, true);
        initComponents();
        setTitle("Manage Games");
        setLocationRelativeTo(parent);

        this.model = model;
        dtm = (DefaultTableModel) tblGames.getModel();
        dtm.addTableModelListener(this);

        refreshTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGames = new javax.swing.JTable();
        tfSearchGame = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnManageRent = new javax.swing.JButton();
        btnAddGame = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        btnDeleteGames1 = new javax.swing.JButton();
        tfGenre = new javax.swing.JTextField();
        tfPlatform = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        platform = new javax.swing.JLabel();
        Genre = new javax.swing.JLabel();
        name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        tblGames.setBackground(new java.awt.Color(102, 102, 102));
        tblGames.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblGames.setForeground(new java.awt.Color(204, 204, 204));
        tblGames.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Genre", "Platform", "Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGames.setFillsViewportHeight(true);
        tblGames.setGridColor(new java.awt.Color(102, 102, 102));
        tblGames.setRowHeight(18);
        tblGames.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblGames.setSelectionForeground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(tblGames);
        if (tblGames.getColumnModel().getColumnCount() > 0) {
            tblGames.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblGames.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblGames.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblGames.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        tfSearchGame.setBackground(new java.awt.Color(102, 102, 102));
        tfSearchGame.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfSearchGame.setForeground(new java.awt.Color(204, 204, 204));
        tfSearchGame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchGameKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Search: ");

        btnManageRent.setBackground(new java.awt.Color(102, 102, 102));
        btnManageRent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnManageRent.setForeground(new java.awt.Color(204, 204, 204));
        btnManageRent.setText("Manage Rent");
        btnManageRent.setBorder(null);
        btnManageRent.setBorderPainted(false);
        btnManageRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRentActionPerformed(evt);
            }
        });

        btnAddGame.setBackground(new java.awt.Color(102, 102, 102));
        btnAddGame.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAddGame.setForeground(new java.awt.Color(204, 204, 204));
        btnAddGame.setText("Add Game");
        btnAddGame.setBorder(null);
        btnAddGame.setBorderPainted(false);
        btnAddGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGameActionPerformed(evt);
            }
        });

        btnOk.setBackground(new java.awt.Color(102, 102, 102));
        btnOk.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnOk.setForeground(new java.awt.Color(204, 204, 204));
        btnOk.setText("OK");
        btnOk.setBorder(null);
        btnOk.setBorderPainted(false);
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnDeleteGames1.setBackground(new java.awt.Color(102, 102, 102));
        btnDeleteGames1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDeleteGames1.setForeground(new java.awt.Color(204, 204, 204));
        btnDeleteGames1.setText("Delete Games");
        btnDeleteGames1.setBorder(null);
        btnDeleteGames1.setBorderPainted(false);
        btnDeleteGames1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteGames1ActionPerformed(evt);
            }
        });

        tfGenre.setBackground(new java.awt.Color(102, 102, 102));
        tfGenre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfGenre.setForeground(new java.awt.Color(204, 204, 204));

        tfPlatform.setBackground(new java.awt.Color(102, 102, 102));
        tfPlatform.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfPlatform.setForeground(new java.awt.Color(204, 204, 204));

        tfName.setBackground(new java.awt.Color(102, 102, 102));
        tfName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfName.setForeground(new java.awt.Color(204, 204, 204));

        platform.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        platform.setForeground(new java.awt.Color(204, 204, 204));
        platform.setText("Platform:");

        Genre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Genre.setForeground(new java.awt.Color(204, 204, 204));
        Genre.setText("Genre:");

        name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(204, 204, 204));
        name.setText("Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteGames1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                    .addComponent(btnManageRent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1))
                            .addComponent(btnAddGame, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSearchGame)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfName)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(name)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Genre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(platform)
                                    .addComponent(tfPlatform, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(Genre)
                    .addComponent(platform))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlatform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddGame, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageRent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSearchGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDeleteGames1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnManageRent, btnOk});

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

    private void btnManageRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRentActionPerformed
        RentDialog rd = new RentDialog(this, model, games.get(tblGames.getSelectedRow()));
        rd.setVisible(true);
        refreshTable();
    }//GEN-LAST:event_btnManageRentActionPerformed

    private void btnAddGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGameActionPerformed
        try {
            model.addGame(new Game(
                    tfName.getText(),
                    tfGenre.getText(),
                    tfPlatform.getText(),
                    0,
                    null
            ));
            refreshTable();
            tfName.setText("");
            tfGenre.setText("");
            tfPlatform.setText("");
            JOptionPane.showMessageDialog(rootPane, "Game was successfully added!", " Success!", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "Database ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddGameActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnDeleteGames1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteGames1ActionPerformed
        int selectedRow = tblGames.getSelectedRow();
        Game game = games.get(selectedRow);
        int confirm = JOptionPane.showConfirmDialog(rootPane, "Do you want to delete " + game.getName() + "?", "Delete!", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                model.deleteGame(game);
                refreshTable();
                JOptionPane.showMessageDialog(rootPane, game.getName() + " was successfuly deleted!", "Success delete!", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.toString(), "Database ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnDeleteGames1ActionPerformed

    private void tfSearchGameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchGameKeyReleased
        isSearch = true;
        searchString = tfSearchGame.getText();
        refreshTable();

    }//GEN-LAST:event_tfSearchGameKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Genre;
    private javax.swing.JButton btnAddGame;
    private javax.swing.JButton btnDeleteGames1;
    private javax.swing.JButton btnManageRent;
    private javax.swing.JButton btnOk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel platform;
    private javax.swing.JTable tblGames;
    private javax.swing.JTextField tfGenre;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPlatform;
    private javax.swing.JTextField tfSearchGame;
    // End of variables declaration//GEN-END:variables

    @Override
    public void tableChanged(TableModelEvent evt) {

        if (evt.getType() == TableModelEvent.UPDATE && evt.getFirstRow() >= 0 && evt.getColumn() >= 0) {

            int rowIndex = evt.getFirstRow();
            int columnIndex = evt.getColumn();

            Object newValue = dtm.getValueAt(rowIndex, columnIndex);
            Game game = games.get(rowIndex);

            switch (columnIndex) {
                case 0:
                    game.setName((String) newValue);
                    break;
                case 1:
                    game.setGenre((String) newValue);
                    break;
                case 2:
                    game.setPlatform((String) newValue);
                    break;
            }
            try {
                model.updateGames(game);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.toString(), "Database ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void refreshTable() {
        try {
            Map<Integer, Member> membersMap = model.getMapMembers();
            games = model.getAllVideoGames();

            dtm.getDataVector().clear();
            dtm.fireTableDataChanged();

            for (Game game : games) {

                if (isSearch == false || (isSearch == true && game.getName().contains(searchString))) {
                    Vector row = new Vector();

                    row.add(game.getName());
                    row.add(game.getGenre());
                    row.add(game.getPlatform());
                    if (game.getMembers_id() == 0) {
                        row.add("in the store");
                    } else {
                        //needs to check if it is a deleted member!
                        row.add(membersMap.get(game.getMembers_id()).getName());
                    }
                    dtm.addRow(row);
                }
            }
            tblGames.setRowSelectionInterval(0, 0);

            isSearch = false;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "Database Error!", JOptionPane.ERROR_MESSAGE);
        }
    }

}
