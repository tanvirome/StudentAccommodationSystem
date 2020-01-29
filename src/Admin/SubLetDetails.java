/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ghossain
 */
public class SubLetDetails extends javax.swing.JFrame {

    /**
     * Creates new form SubLetDetails
     */
    
    String aemail = null;
    String aname = null;
    
    AdminDBConnect adbc = new AdminDBConnect();
    
    public SubLetDetails() {
        initComponents();
    }
    
    public SubLetDetails(String email, String name) {
        initComponents();
        aemail = email;
        aname = name;
    }
    
    public ImageIcon ResizeImage(String imagepath, byte[] pic)
    {
        ImageIcon myImage = null;
        if(imagepath != null)
        {
            myImage = new ImageIcon(imagepath);
        }
        else
        {
            myImage = new ImageIcon(pic);
        }
        
        Image img = myImage.getImage();
        Image img2 = img.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        
        return image;
    }
    
    public void setNullDetails()
    {
        title.setText("");
        subletid.setText("");
        date.setText("");
        address.setText("");
        details.setText("");
        rent.setText("");
        rentType.setText("");
        status.setText("");
        area.setText("");
        city.setText("");
        //photo.setText("");
        //ImageIcon icon = new ImageIcon();
        photo.setIcon(null);
        photo.revalidate();
        photo.repaint();
    }
    
    public void setDetails(String id)
    {
        try{
            String sql = "Select * from subletdetails where subletid = '"+id+"'";
            ResultSet rs = adbc.getDetails(sql);
            byte[] image;
            while(rs.next())
            {
                title.setText(rs.getString("title"));
                subletid.setText(rs.getString("subletid"));
                date.setText(rs.getString("date"));
                address.setText(rs.getString("address"));
                details.setText(rs.getString("details"));
                rent.setText(rs.getString("rent"));
                rentType.setText(rs.getString("renttype"));
                status.setText(rs.getString("status"));
                area.setText(rs.getString("area"));
                city.setText(rs.getString("city"));
                image = rs.getBytes("photo");
                /*Image pic = getToolkit().createImage(image);
                ImageIcon icon = new ImageIcon(pic);
                photo.setIcon(icon);*/

                photo.setIcon(ResizeImage(null, image));

            }
        }catch(Exception e){
            System.out.println("Error : " + e);
            e.printStackTrace();
        }
    }
    
    public void unverifiedData()
    {
        setNullDetails();
        try{
            String uveri = "Unverified";
            String sql = "Select * from subletdetails where status = '"+uveri+"' order by subletid";
            ResultSet rs = adbc.getDetails(sql);
            
            DefaultTableModel tmodel=(DefaultTableModel) table.getModel();
            tmodel.setRowCount(0);
            
            while(rs.next())
            {
                Object o[] = {rs.getString("subletid"), rs.getString("title"), rs.getString("area"), rs.getString("status")};
                tmodel.addRow(o);
            }
        }catch(SQLException e){
            System.out.println("Error : " + e);
        }
    }
    
    public void verifiedData()
    {
        setNullDetails();
        try{
            String veri = "Verified";
            String sql = "Select * from subletdetails where status = '"+veri+"' order by subletid";
            ResultSet rs = adbc.getDetails(sql);
            
            DefaultTableModel tmodel=(DefaultTableModel) table.getModel();
            tmodel.setRowCount(0);
            
            while(rs.next())
            {
                Object o[] = {rs.getString("subletid"), rs.getString("title"), rs.getString("area"), rs.getString("status")};
                tmodel.addRow(o);
            }
        }catch(Exception e){
            System.out.println("Error : " + e);
            e.printStackTrace();
        }
    }
    
    public void allData()
    {
        setNullDetails();
        try{
            //String uveri = "Unverified";
            String sql = "Select * from subletdetails order by subletid";
            ResultSet rs = adbc.getDetails(sql);
            
            DefaultTableModel tmodel=(DefaultTableModel) table.getModel();
            tmodel.setRowCount(0);
            while(rs.next())
            {
                Object o[] = {rs.getString("subletid"), rs.getString("title"), rs.getString("area"), rs.getString("status")};
                tmodel.addRow(o);
            }
        }catch(Exception e){
            System.out.println("Error : " + e);
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        title = new javax.swing.JTextField();
        subletid = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        rent = new javax.swing.JTextField();
        rentType = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        area = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rentlabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        details = new javax.swing.JTextPane();
        photo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        approve = new javax.swing.JButton();
        disapprove = new javax.swing.JButton();
        allData = new javax.swing.JButton();
        verifiedData = new javax.swing.JButton();
        unverifiedData = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        status = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Accommodation - Admin");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 531));

        table.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SubLet ID", "Title", "Area", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(20);
            table.getColumnModel().getColumn(1).setPreferredWidth(150);
            table.getColumnModel().getColumn(2).setPreferredWidth(30);
            table.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        title.setEditable(false);
        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        title.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        title.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        subletid.setEditable(false);
        subletid.setBackground(new java.awt.Color(255, 255, 255));
        subletid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subletid.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        date.setEditable(false);
        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        date.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        rent.setEditable(false);
        rent.setBackground(new java.awt.Color(255, 255, 255));
        rent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rent.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        rentType.setEditable(false);
        rentType.setBackground(new java.awt.Color(255, 255, 255));
        rentType.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rentType.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        city.setEditable(false);
        city.setBackground(new java.awt.Color(255, 255, 255));
        city.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        city.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        area.setEditable(false);
        area.setBackground(new java.awt.Color(255, 255, 255));
        area.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        area.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Title:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Sublet ID:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Date:");

        rentlabel.setBackground(new java.awt.Color(255, 255, 255));
        rentlabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rentlabel.setText("Rent:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Rent Type:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("City:");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Area:");

        address.setEditable(false);
        address.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(address);

        jScrollPane4.setViewportView(details);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Address:");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Details:");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Picture:");

        approve.setText("Approve");
        approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveActionPerformed(evt);
            }
        });

        disapprove.setText("Disapprove");
        disapprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disapproveActionPerformed(evt);
            }
        });

        allData.setText("All");
        allData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allDataActionPerformed(evt);
            }
        });

        verifiedData.setText("Verified");
        verifiedData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifiedDataActionPerformed(evt);
            }
        });

        unverifiedData.setText("Unverified");
        unverifiedData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unverifiedDataActionPerformed(evt);
            }
        });

        BackButton.setBackground(new java.awt.Color(255, 255, 255));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back_icon.png"))); // NOI18N
        BackButton.setBorderPainted(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        status.setEditable(false);
        status.setBackground(new java.awt.Color(255, 255, 255));
        status.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        status.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Status:");

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setText("Sub-Let Information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(rentlabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel12)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel13))
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(subletid, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rent, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addComponent(rentType, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel8)))
                        .addGap(10, 10, 10)
                        .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(allData, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(verifiedData, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(unverifiedData, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(approve, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(disapprove, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21)
                        .addComponent(rentlabel)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel10)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel11)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel13)
                        .addGap(6, 6, 6)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subletid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel6))
                            .addComponent(rentType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel8))
                            .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(allData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(verifiedData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unverifiedData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(approve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disapprove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1188, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:

        DefaultTableModel model=(DefaultTableModel) table.getModel();
        int index = table.getSelectedRow();

        String id = model.getValueAt(index, 0).toString();
        
        setDetails(id);
    }//GEN-LAST:event_tableMouseClicked

    private void approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveActionPerformed
        // TODO add your handling code here:

        if("".equals(subletid.getText()))
        {
            JOptionPane.showMessageDialog(this, "Data is not selected.");
        }
        else
        {
            String id = subletid.getText();
            String stat = "Verified";
            String sql = "Update subletdetails set status = '"+stat+"' where subletid = '"+id+"'";
            adbc.setDetails(sql);
            //verifiedData.doClick();
            verifiedData();
            setDetails(id);
        }

    }//GEN-LAST:event_approveActionPerformed

    private void disapproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disapproveActionPerformed
        // TODO add your handling code here:

        if("".equals(subletid.getText()))
        {
            JOptionPane.showMessageDialog(this, "Data is not selected.");
        }
        else
        {
            String id = subletid.getText();
            String stat = "Unverified";
            String sql = "Update subletdetails set status = '"+stat+"' where subletid = '"+id+"'";
            adbc.setDetails(sql);
            //unverifiedData.doClick();
            unverifiedData();
            setDetails(id);
        }

    }//GEN-LAST:event_disapproveActionPerformed

    private void allDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allDataActionPerformed
        // TODO add your handling code here:
        
        allData();
    }//GEN-LAST:event_allDataActionPerformed

    private void verifiedDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifiedDataActionPerformed
        // TODO add your handling code here:
        
        verifiedData();
    }//GEN-LAST:event_verifiedDataActionPerformed

    private void unverifiedDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unverifiedDataActionPerformed
        // TODO add your handling code here:
        
        unverifiedData();
    }//GEN-LAST:event_unverifiedDataActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:

        AdminMainPage amp = new AdminMainPage(aemail, aname);
        amp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:

        if("".equals(subletid.getText()))
        {
            JOptionPane.showMessageDialog(this, "Data is not selected.");
        }
        else
        {
            String id = subletid.getText();
            String sql = "Delete from subletdetails where subletid = '"+id+"'";
            adbc.setDetails(sql);
            JOptionPane.showMessageDialog(this, "Data is Deleted");
            //allData.doClick();
            allData();
            setNullDetails();
        }
    }//GEN-LAST:event_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SubLetDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubLetDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubLetDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubLetDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubLetDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextPane address;
    private javax.swing.JButton allData;
    private javax.swing.JButton approve;
    private javax.swing.JTextField area;
    private javax.swing.JTextField city;
    private javax.swing.JTextField date;
    private javax.swing.JButton delete;
    private javax.swing.JTextPane details;
    private javax.swing.JButton disapprove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField rent;
    private javax.swing.JTextField rentType;
    private javax.swing.JLabel rentlabel;
    private javax.swing.JTextField status;
    private javax.swing.JTextField subletid;
    private javax.swing.JTable table;
    private javax.swing.JTextField title;
    private javax.swing.JButton unverifiedData;
    private javax.swing.JButton verifiedData;
    // End of variables declaration//GEN-END:variables
}
