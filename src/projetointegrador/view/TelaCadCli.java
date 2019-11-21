/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegrador.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetointegrador.Controller.ClienteController;

/**
 *
 * @author carlos.hmsousa1
 */
public class TelaCadCli extends javax.swing.JFrame {
    String modoTela = "Criar";

    /**
     * Creates new form TelaCadCli
     */
    public TelaCadCli() {
        initComponents();
        DesabilitarFormulario();
        
        //Consulta no banco de dados os clientes já cadastrados
        
        CarregarTabela();
        setLocationRelativeTo(null);
    }
    public void HabilitarFormulario(){
    
        
        this.jtNome.setEnabled(true);
        this.jfCPF.setEnabled(true);
        this.jtBairro.setEnabled(true);
        this.jfCEP.setEnabled(true);
        this.jtCidade.setEnabled(true);
        this.jtEndereco.setEnabled(true);
        this.jfTelefone.setEnabled(true);
        this.btnSalvar.setEnabled(true);
        this.btnCancelar.setEnabled(true);
        this.jblCivil.setEnabled(true);
        this.jfData.setEnabled(true);
        
    }
    
    public void DesabilitarFormulario(){
    
        
        this.jtNome.setEnabled(false);
        this.jfCPF.setEnabled(false);
        this.jtBairro.setEnabled(false);
        this.jfCEP.setEnabled(false);
        this.jtCidade.setEnabled(false);
        this.jtEndereco.setEnabled(false);
        this.jfTelefone.setEnabled(false);
        this.btnSalvar.setEnabled(false);
        this.btnCancelar.setEnabled(false);
        this.jblCivil.setEnabled(false);
        this.jfData.setEnabled(false);
    }
    
    public void LimparFormulario(){
        
        this.jblIDC.setText("");
        this.jtNome.setText("");
        this.jfCPF.setText("");
        this.jtBairro.setText("");
        this.jfCEP.setText("");
        this.jtCidade.setText("");
        this.jtEndereco.setText("");
        this.jfTelefone.setText("");
        this.jblCivil.setText("");
        this.jfData.setText("");
    }
    
     public void CarregarTabela(){
        
        //Peço ao controller resgatar os clientes do banco de dados
        ArrayList<String[]> linhasClientes = ClienteController.consultarClientes();
        
        //Opção 1 - Crio manualmente um modelo para a tabela e defino as colunas
        DefaultTableModel tmClientes = new DefaultTableModel();
        tmClientes.addColumn("idclientes");
        tmClientes.addColumn("Nome");
        tmClientes.addColumn("Data");
        tmClientes.addColumn("CPF");
        tmClientes.addColumn("Estado Civil");
        tmClientes.addColumn("Telefone");
        tmClientes.addColumn("Endereço");
        tmClientes.addColumn("Bairro");
        tmClientes.addColumn("Cidade");
        tmClientes.addColumn("CEP");
        
        jTable1.setModel(tmClientes);
        
        //Removo a coluna da View (JTable) mas mantenho na model para armazenar o ID
        jTable1.removeColumn(jTable1.getColumnModel().getColumn(0));
        
        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for(String[] c:linhasClientes)
        {
            tmClientes.addRow(c);
        }
        
        //Defino o tamanho para cada coluna
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(300);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
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
        jPanel2 = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jtPesquisar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jblCPF = new javax.swing.JLabel();
        jtBairro = new javax.swing.JTextField();
        jblCEP = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jtNome = new javax.swing.JTextField();
        jblCidade = new javax.swing.JLabel();
        jblEndereco = new javax.swing.JLabel();
        jtCidade = new javax.swing.JTextField();
        jtEndereco = new javax.swing.JTextField();
        jblIDC = new javax.swing.JLabel();
        jblNome = new javax.swing.JLabel();
        jfCPF = new javax.swing.JFormattedTextField();
        btnCancelar = new javax.swing.JButton();
        jblBairro = new javax.swing.JLabel();
        jfTelefone = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jfCEP = new javax.swing.JFormattedTextField();
        jblTelefone = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jfData = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jblCivil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/editt.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pesquisar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancel.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jtPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jblCPF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblCPF.setText("CPF:");

        jblCEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblCEP.setText("CEP:");

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jblCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblCidade.setText("Cidade:");

        jblEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblEndereco.setText("Endereço:");

        jblNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblNome.setText("Nome:");

        try {
            jfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jblBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblBairro.setText("Bairro:");

        try {
            jfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ID:");

        try {
            jfCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jblTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblTelefone.setText("Telefone:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Data de Nascimento:");

        try {
            jfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Estado Civil:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtCidade)
                        .addGap(172, 172, 172))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jblIDC, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(197, 197, 197)
                                        .addComponent(jblBairro)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addComponent(jblCidade))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jfData)
                                        .addGap(141, 141, 141))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addComponent(jblNome)
                                .addGap(227, 227, 227)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jblCPF)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jblCEP)
                                    .addComponent(jfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(44, 44, 44))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jblCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jblTelefone)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jblEndereco)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jblNome)
                    .addComponent(jblCPF)
                    .addComponent(jblTelefone)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblIDC, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jblCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblEndereco)
                            .addComponent(jblBairro)
                            .addComponent(jblCidade)
                            .addComponent(jblCEP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if(modoTela.equals("Criar"))
            {
                //Passo ao controller a entrada do usuário e peço para salvar no banco de dados
                if(ClienteController.salvar(jtNome.getText(), jfData.getText() ,jfCPF.getText(), jblCivil.getText(), jfTelefone.getText(), jtEndereco.getText(), jtBairro.getText(), jtCidade.getText(),jfCEP.getText()))
                {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.CarregarTabela();
                    
                    JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso!");
                    LimparFormulario();
                }else{
                    JOptionPane.showMessageDialog(null,"Falha ao cadastrar cliente!");
                }

            }else
            {

                //Passo ao controller a entrada do usuário e peço para atualizar o banco de dados
                if(ClienteController.atualizar(Integer.parseInt(jblIDC.getText()), jtNome.getText(), jfData.getText() ,jfCPF.getText(), jblCivil.getText(), jfTelefone.getText(), jtEndereco.getText(), jtBairro.getText(), jtCidade.getText(),jfCEP.getText()))
                {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.CarregarTabela();
                    JOptionPane.showMessageDialog(this,"Cliente atualizado com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(this,"Falha ao atualizar dados do cliente!");
                }

            }

            LimparFormulario();
            DesabilitarFormulario();
            
            
                
        
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        modoTela = "Criar";
        HabilitarFormulario();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        modoTela = "Editar";
        
        //Verifico se há linhas para poder editar
        if(jTable1.getRowCount()>0)
        {
            //Verifico se o usuário selecionou alguma linha (Primeira linha = 0) | Nada selecionado = -1)
            if(jTable1.getSelectedRow()>=0)
            {
                HabilitarFormulario();
                
                //Variável acessória para identifcar se o formulário está em modo de edição ou alteração
                modoTela = "Editar";

                //Atribuo os valores que estão na linha selecionada para a tabela
                jblIDC.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString());
                jtNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1).toString());
                jfData.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2).toString());
                jfCPF.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3).toString());
                jblCivil.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4).toString());
                jfTelefone.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 5).toString());
                jtEndereco.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 6).toString());
                jtBairro.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 7).toString());
                jtCidade.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 8).toString());
                jfCEP.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 9).toString());
                
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Selecione um cliente para editar!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Não há cliente para editar!");
        }
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        if(jTable1.getRowCount()>0)
        {
            //Resgato o número da linha pelo JTable
            int numeroLinha = jTable1.getSelectedRow();
            
            //Resgato o ID (oculto) do cliente pelo JTableModel
            int IDcliente = Integer.parseInt(jTable1.getModel().getValueAt(numeroLinha, 0).toString());
            
            //Realizo a exclusão do cliente pelo ID
            if(ClienteController.excluir(IDcliente))
            {
                //Recarrego a tabela, consultando diretamente do banco de dados
                this.CarregarTabela();
                JOptionPane.showMessageDialog(this,"Cliente excluído da base de dados");
            }else{
                JOptionPane.showMessageDialog(this,"Falha ao excluir o cliente!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Não há cliente para excluir!");
        }
        
        this.DesabilitarFormulario();
        this.LimparFormulario();
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadCli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jblBairro;
    private javax.swing.JLabel jblCEP;
    private javax.swing.JLabel jblCPF;
    private javax.swing.JLabel jblCidade;
    private javax.swing.JTextField jblCivil;
    private javax.swing.JLabel jblEndereco;
    private javax.swing.JLabel jblIDC;
    private javax.swing.JLabel jblNome;
    private javax.swing.JLabel jblTelefone;
    private javax.swing.JFormattedTextField jfCEP;
    private javax.swing.JFormattedTextField jfCPF;
    private javax.swing.JFormattedTextField jfData;
    private javax.swing.JFormattedTextField jfTelefone;
    private javax.swing.JTextField jtBairro;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPesquisar;
    // End of variables declaration//GEN-END:variables
}
