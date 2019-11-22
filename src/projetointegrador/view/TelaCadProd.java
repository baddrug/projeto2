/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegrador.view;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetointegrador.Controller.FornecedorController;
import projetointegrador.Controller.ProdutoController;

/**
 *
 * @author carlo
 */
public class TelaCadProd extends javax.swing.JFrame {
    String modoTela = "Criar";

    /**
     * Creates new form TelaCadProd
     */
    public TelaCadProd() {
        initComponents();
        DesabilitarFormulario();
        CarregarTabela();
        setLocationRelativeTo(null);
    }
    public void HabilitarFormulario(){
    
        
        this.jtNome.setEnabled(true);
        this.jfValor.setEnabled(true);
        this.jtQuanti.setEnabled(true);
        
        this.jcFornecedor.setEnabled(true);
        this.btnSalvarProd.setEnabled(true);
        this.btnCancelar.setEnabled(true);
        this.jtNomeForn.setEnabled(true);
        this.jfCNPJ.setEnabled(true);
        this.jtBairro.setEnabled(true);
        this.jfCEP.setEnabled(true);
        this.jtCidade.setEnabled(true);
        this.jtEndereco.setEnabled(true);
        this.jfTelefone.setEnabled(true);
        this.jtUF.setEnabled(true);
        this.bntSalvar.setEnabled(true);
        this.bntCancelar.setEnabled(true);
        
    }
    public void DesabilitarFormulario(){
    
        
        this.jtNome.setEnabled(false);
        this.jfValor.setEnabled(false);
        this.jtQuanti.setEnabled(false);
        
        this.jcFornecedor.setEnabled(false);
        this.btnSalvarProd.setEnabled(false);
        this.btnCancelar.setEnabled(false);
        
        this.jtNomeForn.setEnabled(false);
        this.jfCNPJ.setEnabled(false);
        this.jtBairro.setEnabled(false);
        this.jfCEP.setEnabled(false);
        this.jtCidade.setEnabled(false);
        this.jtEndereco.setEnabled(false);
        this.jfTelefone.setEnabled(false);
        this.jtUF.setEnabled(false);
        this.bntSalvar.setEnabled(false);
        this.bntCancelar.setEnabled(false);
        
    }
    public void LimparFormulario(){
        
        this.jblIDP.setText("");
        this.jtNome.setText("");
        this.jfValor.setText("");
        this.jtQuanti.setText("");
        this.jtQuanti.setText("");
        this.jblIDF.setText("");
        this.jtNomeForn.setText("");
        this.jfCNPJ.setText("");
        this.jtBairro.setText("");
        this.jfCEP.setText("");
        this.jtCidade.setText("");
        this.jtEndereco.setText("");
        this.jfTelefone.setText("");
        this.jtUF.setText("");
        this.jblCampNome.setText("");
        
        
        
    }
    public void CarregarTabela(){
        
        //Peço ao controller resgatar os clientes do banco de dados
        ArrayList<String[]> linhasProduto = ProdutoController.consultarProduto();
        ArrayList<String[]> linhasFornecedor = FornecedorController.consultarFornecedor();
        //Opção 1 - Crio manualmente um modelo para a tabela e defino as colunas
        DefaultTableModel tmProduto = new DefaultTableModel();
        tmProduto.addColumn("ID");
        
        tmProduto.addColumn("Nome");
        tmProduto.addColumn("Valor");
        tmProduto.addColumn("Quantidade");
        tmProduto.addColumn("Fornecedor");
        
        
        
        
        
        
        jTable1.setModel(tmProduto);
        
        //Removo a coluna da View (JTable) mas mantenho na model para armazenar o ID
        jTable1.removeColumn(jTable1.getColumnModel().getColumn(0));
        
        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for(String[] p:linhasProduto)
        {
            tmProduto.addRow(p);
        }
        
        //Defino o tamanho para cada coluna
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(300);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        
        
        
        //Opção 1 - Crio manualmente um modelo para a tabela e defino as colunas
        DefaultTableModel tmFornecedor = new DefaultTableModel();
        tmFornecedor.addColumn("ID");
        tmFornecedor.addColumn("Nome");
        tmFornecedor.addColumn("CNPJ");
        tmFornecedor.addColumn("Telefone");
        tmFornecedor.addColumn("Endereço");
        tmFornecedor.addColumn("Bairro");
        tmFornecedor.addColumn("CEP");
        tmFornecedor.addColumn("UF");
        
        jTable2.setModel(tmFornecedor);
        
        //Removo a coluna da View (JTable) mas mantenho na model para armazenar o ID
        jTable2.removeColumn(jTable2.getColumnModel().getColumn(0));
        
        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for(String[] f:linhasFornecedor)
        {
            tmFornecedor.addRow(f);
        }
        
        //Defino o tamanho para cada coluna
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(300);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(100);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jfValor = new javax.swing.JFormattedTextField();
        jtNome = new javax.swing.JTextField();
        jblValor = new javax.swing.JLabel();
        jblFornecedor = new javax.swing.JLabel();
        jblID = new javax.swing.JLabel();
        jblNome = new javax.swing.JLabel();
        jtQuanti = new javax.swing.JTextField();
        jblQuant = new javax.swing.JLabel();
        btnSalvarProd = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jblIDP = new javax.swing.JLabel();
        jcFornecedor = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jsTabela = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRemover = new javax.swing.JButton();
        jtPesquisar = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jblBairro = new javax.swing.JLabel();
        jblCidade = new javax.swing.JLabel();
        jblUF = new javax.swing.JLabel();
        jtBairro = new javax.swing.JTextField();
        jblEndereco = new javax.swing.JLabel();
        jtNomeForn = new javax.swing.JTextField();
        jfCEP = new javax.swing.JFormattedTextField();
        jtCidade = new javax.swing.JTextField();
        jblNomeForn = new javax.swing.JLabel();
        jfTelefone = new javax.swing.JFormattedTextField();
        jblTel = new javax.swing.JLabel();
        bntSalvar = new javax.swing.JButton();
        jtUF = new javax.swing.JTextField();
        jtEndereco = new javax.swing.JTextField();
        jblCEP = new javax.swing.JLabel();
        jblID1 = new javax.swing.JLabel();
        bntCancelar = new javax.swing.JButton();
        jblIDF = new javax.swing.JLabel();
        jblCNPJ = new javax.swing.JLabel();
        jfCNPJ = new javax.swing.JFormattedTextField();
        jblCampBairro = new javax.swing.JLabel();
        jblCampCidade = new javax.swing.JLabel();
        jblCampUF = new javax.swing.JLabel();
        jblCampCEP = new javax.swing.JLabel();
        jblCampEndereco = new javax.swing.JLabel();
        jblCampTel = new javax.swing.JLabel();
        jblCampCNPJ = new javax.swing.JLabel();
        jblCampNome = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        bntNovo = new javax.swing.JButton();
        bntEditar = new javax.swing.JButton();
        jtPesquisar1 = new javax.swing.JTextField();
        bntPesquisar = new javax.swing.JButton();
        bntRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        try {
            jfValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeActionPerformed(evt);
            }
        });

        jblValor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblValor.setText("*Valor:");

        jblFornecedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblFornecedor.setText("*Fornecedor:");

        jblID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblID.setText("ID:");

        jblNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblNome.setText("*Nome:");

        jblQuant.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblQuant.setText("*Quant. Estoque:");

        btnSalvarProd.setBackground(new java.awt.Color(153, 153, 153));
        btnSalvarProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvarProd.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarProd.setText("Salvar");
        btnSalvarProd.setBorderPainted(false);
        btnSalvarProd.setFocusPainted(false);
        btnSalvarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalvarProdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalvarProdMouseExited(evt);
            }
        });
        btnSalvarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });

        jcFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jcFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcFornecedorActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor", "Quantidade"
            }
        ));
        jsTabela.setViewportView(jTable1);

        btnRemover.setBackground(new java.awt.Color(153, 153, 153));
        btnRemover.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemover.setForeground(new java.awt.Color(255, 255, 255));
        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setBorderPainted(false);
        btnRemover.setFocusPainted(false);
        btnRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoverMouseExited(evt);
            }
        });
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        jtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPesquisarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(153, 153, 153));
        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/editt.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorderPainted(false);
        btnEditar.setFocusPainted(false);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNovo.setBackground(new java.awt.Color(153, 153, 153));
        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setBorderPainted(false);
        btnNovo.setFocusPainted(false);
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNovoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNovoMouseExited(evt);
            }
        });
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnPesquisar.setBackground(new java.awt.Color(153, 153, 153));
        btnPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pesquisar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorderPainted(false);
        btnPesquisar.setFocusPainted(false);
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jsTabela, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jblFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 890, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jblIDP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jblNome)
                                .addGap(0, 414, Short.MAX_VALUE))
                            .addComponent(jtNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblValor)
                            .addComponent(jfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblQuant)
                            .addComponent(jtQuanti, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblID)
                    .addComponent(jblNome)
                    .addComponent(jblValor)
                    .addComponent(jblQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtQuanti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jblIDP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jblFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastro de Produto", jPanel1);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jblBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblBairro.setText("*Bairro:");

        jblCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblCidade.setText("*Cidade:");

        jblUF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblUF.setText("*UF:");

        jblEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblEndereco.setText("*Endereço:");

        try {
            jfCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jblNomeForn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblNomeForn.setText("*Nome:");

        try {
            jfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jblTel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblTel.setText("*Telefone:");

        bntSalvar.setBackground(new java.awt.Color(153, 153, 153));
        bntSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntSalvar.setForeground(new java.awt.Color(255, 255, 255));
        bntSalvar.setText("Salvar");
        bntSalvar.setBorderPainted(false);
        bntSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntSalvar.setFocusPainted(false);
        bntSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntSalvarMouseExited(evt);
            }
        });
        bntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarActionPerformed(evt);
            }
        });

        jblCEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblCEP.setText("*CEP:");

        jblID1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblID1.setText("ID:");

        bntCancelar.setBackground(new java.awt.Color(153, 153, 153));
        bntCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntCancelar.setForeground(new java.awt.Color(255, 255, 255));
        bntCancelar.setText("Cancelar");
        bntCancelar.setBorderPainted(false);
        bntCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntCancelar.setFocusPainted(false);
        bntCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntCancelarMouseExited(evt);
            }
        });
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });

        jblCNPJ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblCNPJ.setText("*CNPJ");

        try {
            jfCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jblCampBairro.setForeground(new java.awt.Color(255, 0, 0));
        jblCampBairro.setText("*Campo Obrigatório");

        jblCampCidade.setForeground(new java.awt.Color(255, 0, 0));
        jblCampCidade.setText("*Campo Obrigatório");

        jblCampUF.setForeground(new java.awt.Color(255, 0, 0));
        jblCampUF.setText("*Campo Obrigatório");

        jblCampCEP.setForeground(new java.awt.Color(255, 0, 0));
        jblCampCEP.setText("*Campo Obrigatório");

        jblCampEndereco.setForeground(new java.awt.Color(255, 0, 0));
        jblCampEndereco.setText("*Campo Obrigatório");

        jblCampTel.setForeground(new java.awt.Color(255, 0, 0));
        jblCampTel.setText("*Campo Obrigatório");

        jblCampCNPJ.setForeground(new java.awt.Color(255, 0, 0));
        jblCampCNPJ.setText("*Campo Obrigatório");

        jblCampNome.setForeground(new java.awt.Color(255, 0, 0));
        jblCampNome.setText("*Campo Obrigatório");

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        bntNovo.setBackground(new java.awt.Color(153, 153, 153));
        bntNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntNovo.setForeground(new java.awt.Color(255, 255, 255));
        bntNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        bntNovo.setText("Novo");
        bntNovo.setBorderPainted(false);
        bntNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntNovo.setFocusPainted(false);
        bntNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntNovoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntNovoMouseExited(evt);
            }
        });
        bntNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNovoActionPerformed(evt);
            }
        });

        bntEditar.setBackground(new java.awt.Color(153, 153, 153));
        bntEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntEditar.setForeground(new java.awt.Color(255, 255, 255));
        bntEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/editt.png"))); // NOI18N
        bntEditar.setText("Editar");
        bntEditar.setBorderPainted(false);
        bntEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntEditar.setFocusPainted(false);
        bntEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntEditarMouseExited(evt);
            }
        });
        bntEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEditarActionPerformed(evt);
            }
        });

        bntPesquisar.setBackground(new java.awt.Color(153, 153, 153));
        bntPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        bntPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pesquisar.png"))); // NOI18N
        bntPesquisar.setText("Pesquisar");
        bntPesquisar.setBorderPainted(false);
        bntPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntPesquisar.setFocusPainted(false);
        bntPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntPesquisarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntPesquisarMouseExited(evt);
            }
        });

        bntRemover.setBackground(new java.awt.Color(153, 153, 153));
        bntRemover.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntRemover.setForeground(new java.awt.Color(255, 255, 255));
        bntRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        bntRemover.setText("Remover");
        bntRemover.setBorderPainted(false);
        bntRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntRemover.setFocusPainted(false);
        bntRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntRemoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntRemoverMouseExited(evt);
            }
        });
        bntRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRemoverActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtPesquisar1)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bntRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntPesquisar))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntPesquisar)
                    .addComponent(jtPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(bntNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntRemover))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jblID1)
                                    .addComponent(jblIDF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jblNomeForn)
                                    .addComponent(jtNomeForn, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jblCampNome)))
                            .addComponent(jblBairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jblCNPJ)
                                        .addGap(71, 71, 71)
                                        .addComponent(jblTel))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jblCidade))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jblCampCNPJ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jblCampTel)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jblEndereco)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jblCampEndereco)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jtEndereco)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblCampBairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblCampCidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jblCampUF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jblCampCEP))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jblUF))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jblCEP)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jfCEP))))))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblID1)
                    .addComponent(jblNomeForn)
                    .addComponent(jblCNPJ)
                    .addComponent(jblEndereco)
                    .addComponent(jblTel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jblIDF, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtNomeForn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jblCampCNPJ)
                        .addComponent(jblCampNome))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jblCampTel)
                        .addComponent(jblCampEndereco)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblCidade)
                            .addComponent(jblUF)
                            .addComponent(jblCEP)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jblBairro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtUF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblCampCidade)
                            .addComponent(jblCampBairro))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblCampUF)
                            .addComponent(jblCampCEP))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastro de Fornecedor", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRemoverActionPerformed
        // TODO add your handling code here:
        if(jTable1.getRowCount()>0)
        {
            //Resgato o número da linha pelo JTable
            int numeroLinha = jTable1.getSelectedRow();

            //Resgato o ID (oculto) do cliente pelo JTableModel
            int IDfornecedor = Integer.parseInt(jTable1.getModel().getValueAt(numeroLinha, 0).toString());

            //Realizo a exclusão do cliente pelo ID
            if(FornecedorController.excluirFornecedor(IDfornecedor))
            {
                //Recarrego a tabela, consultando diretamente do banco de dados
                this.CarregarTabela();
                JOptionPane.showMessageDialog(this,"Forncedor excluído da base de dados");
            }else{
                JOptionPane.showMessageDialog(this,"Falha ao excluir o fornecedor!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Não há fornecedor para excluir!");
        }

        this.DesabilitarFormulario();
        this.LimparFormulario();
    }//GEN-LAST:event_bntRemoverActionPerformed

    private void bntRemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntRemoverMouseExited
        // TODO add your handling code here:
        bntRemover.setBackground(new Color(153,153,153));
        bntRemover.setForeground(Color.WHITE);
    }//GEN-LAST:event_bntRemoverMouseExited

    private void bntRemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntRemoverMouseEntered
        // TODO add your handling code here:
        bntRemover.setBackground(new Color(235,235,235));
        bntRemover.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_bntRemoverMouseEntered

    private void bntPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntPesquisarMouseExited
        // TODO add your handling code here:
        bntPesquisar.setBackground(new Color(153,153,153));
        bntPesquisar.setForeground(Color.WHITE);
    }//GEN-LAST:event_bntPesquisarMouseExited

    private void bntPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntPesquisarMouseEntered
        // TODO add your handling code here:
        bntPesquisar.setBackground(new Color(235,235,235));
        bntPesquisar.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_bntPesquisarMouseEntered

    private void bntEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEditarActionPerformed
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
            jblIDF.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString());
            jtNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1).toString());
            jfCNPJ.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2).toString());
            jtBairro.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3).toString());
            jfCEP.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4).toString());
            jtCidade.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 5).toString());
            jtEndereco.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 6).toString());
            jfTelefone.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 7).toString());
            jtUF.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 8).toString());
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
    }//GEN-LAST:event_bntEditarActionPerformed

    private void bntEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntEditarMouseExited
        // TODO add your handling code here:
        bntEditar.setBackground(new Color(153,153,153));
        bntEditar.setForeground(Color.WHITE);
    }//GEN-LAST:event_bntEditarMouseExited

    private void bntEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntEditarMouseEntered
        // TODO add your handling code here:
        bntEditar.setBackground(new Color(235,235,235));
        bntEditar.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_bntEditarMouseEntered

    private void bntNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNovoActionPerformed
        // TODO add your handling code here:
        modoTela = "Criar";
        HabilitarFormulario();
    }//GEN-LAST:event_bntNovoActionPerformed

    private void bntNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntNovoMouseExited
        // TODO add your handling code here:
        bntNovo.setBackground(new Color(153,153,153));
        bntNovo.setForeground(Color.WHITE);
    }//GEN-LAST:event_bntNovoMouseExited

    private void bntNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntNovoMouseEntered
        // TODO add your handling code here:
        bntNovo.setBackground(new Color(235,235,235));
        bntNovo.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_bntNovoMouseEntered

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        // TODO add your handling code here:
        this.DesabilitarFormulario();
        this.LimparFormulario();
    }//GEN-LAST:event_bntCancelarActionPerformed

    private void bntCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntCancelarMouseExited
        // TODO add your handling code here:
        bntCancelar.setBackground(new Color(153,153,153));
        bntCancelar.setForeground(Color.WHITE);
    }//GEN-LAST:event_bntCancelarMouseExited

    private void bntCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntCancelarMouseEntered
        // TODO add your handling code here:
        bntCancelar.setBackground(new Color(235,235,235));
        bntCancelar.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_bntCancelarMouseEntered

    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
        // TODO add your handling code here:

        if (jtNomeForn.getText().length() > 0) {
            jblCampNome.setVisible(false);
        } else {
            jblCampNome.setVisible(true);
        }

        if (jfCNPJ.getText().length() > 4) {
            jblCampCNPJ.setVisible(false);
        } else {
            jblCNPJ.setVisible(true);
        }
        if (jfTelefone.getText().length() > 0) {
            jblCampTel.setVisible(false);
        } else {
            jblCampTel.setVisible(true);
        }if (jtEndereco.getText().length() > 0) {
            jblCampEndereco.setVisible(false);
        } else {
            jblCampEndereco.setVisible(true);
        }if (jtBairro.getText().length() > 0) {
            jblCampBairro.setVisible(false);
        } else {
            jblCampBairro.setVisible(true);
        }if (jtCidade.getText().length() > 0) {
            jblCampCidade.setVisible(false);
        } else {
            jblCampCidade.setVisible(true);
        }if (jtUF.getText().length() > 0) {
            jblCampUF.setVisible(false);
        } else {
            jblCampUF.setVisible(true);
        }if (jfCEP.getText().length() > 0) {
            jblCampCEP.setVisible(false);
        } else {
            jblCampCEP.setVisible(true);
        }
        if ((jtNomeForn.getText().length()>0)
            &&(jfCNPJ.getText().length()> 0)
            && (jfTelefone.getText().length() > 0) && (jfCEP.getText().length() > 0
                && jtBairro.getText().length() > 0) && (jtCidade.getText().length() > 0)
            && (jtEndereco.getText().length() > 0 && (jtUF.getText().length() > 0))) {
            JOptionPane.showMessageDialog(null, "Dados Validados aqui deve ser efetuada a operação!!");
        } else {
            JOptionPane.showMessageDialog(null, "Confira os campos Obrigatórios!!");
        }
        if(modoTela.equals("Criar"))
        {
            //Passo ao controller a entrada do usuário e peço para salvar no banco de dados
            if(FornecedorController.salvarFornecedor(jtNomeForn.getText(),jfCNPJ.getText(), jtBairro.getText(),jfCEP.getText(), jtCidade.getText(), jtEndereco.getText(), jfTelefone.getText(), jtUF.getText()))
            {
                //Recarrego a tabela com os dados resgatados do banco de dados
                this.CarregarTabela();

                JOptionPane.showMessageDialog(null,"Fornecedor cadastrado com sucesso!");
                LimparFormulario();
            }else{
                JOptionPane.showMessageDialog(null,"Falha ao cadastrar Forncedor!");
            }

        }else
        {

            //Passo ao controller a entrada do usuário e peço para atualizar o banco de dados
            if(FornecedorController.atualizarFornecedor(Integer.parseInt(jblIDF.getText()), jtNomeForn.getText(),jfCNPJ.getText(), jtBairro.getText(),jfCEP.getText(), jtCidade.getText(), jtEndereco.getText(), jfTelefone.getText(), jtUF.getText()))
            {
                //Recarrego a tabela com os dados resgatados do banco de dados
                this.CarregarTabela();
                JOptionPane.showMessageDialog(this,"Fornecedor atualizado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(this,"Falha ao atualizar dados do Fornecedor!");
            }

        }

        LimparFormulario();
        DesabilitarFormulario();
    }//GEN-LAST:event_bntSalvarActionPerformed

    private void bntSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntSalvarMouseExited
        // TODO add your handling code here:
        bntSalvar.setBackground(new Color(153,153,153));
        bntSalvar.setForeground(Color.WHITE);
    }//GEN-LAST:event_bntSalvarMouseExited

    private void bntSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntSalvarMouseEntered
        // TODO add your handling code here:
        bntSalvar.setBackground(new Color(235,235,235));
        bntSalvar.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_bntSalvarMouseEntered

    private void btnPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseExited
        // TODO add your handling code here:
        btnPesquisar.setBackground(new Color(153,153,153));
        btnPesquisar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnPesquisarMouseExited

    private void btnPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseEntered
        // TODO add your handling code here:
        btnPesquisar.setBackground(new Color(235,235,235));
        btnPesquisar.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_btnPesquisarMouseEntered

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        modoTela = "Criar";
        HabilitarFormulario();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseExited
        // TODO add your handling code here:
        btnNovo.setBackground(new Color(153,153,153));
        btnNovo.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnNovoMouseExited

    private void btnNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseEntered
        // TODO add your handling code here:
        btnNovo.setBackground(new Color(235,235,235));
        btnNovo.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_btnNovoMouseEntered

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
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
            jblIDP.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString());

            jtNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1).toString());
            jfValor.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2).toString());
            jtQuanti.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3).toString());

            jcFornecedor.setName(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4).toString());

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
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        // TODO add your handling code here:
        btnEditar.setBackground(new Color(153,153,153));
        btnEditar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        // TODO add your handling code here:
        btnEditar.setBackground(new Color(235,235,235));
        btnEditar.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void jtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPesquisarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        if(jTable1.getRowCount()>0)
        {
            //Resgato o número da linha pelo JTable
            int numeroLinha = jTable1.getSelectedRow();

            //Resgato o ID (oculto) do cliente pelo JTableModel
            int IDproduto = Integer.parseInt(jTable1.getModel().getValueAt(numeroLinha, 0).toString());

            //Realizo a exclusão do cliente pelo ID
            if(ProdutoController.excluirProduto(IDproduto))
            {
                //Recarrego a tabela, consultando diretamente do banco de dados
                this.CarregarTabela();
                JOptionPane.showMessageDialog(this,"Produto excluído da base de dados");
            }else{
                JOptionPane.showMessageDialog(this,"Falha ao excluir o produto!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Não há produto para excluir!");
        }

        this.DesabilitarFormulario();
        this.LimparFormulario();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnRemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMouseExited
        // TODO add your handling code here:
        btnRemover.setBackground(new Color(153,153,153));
        btnRemover.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnRemoverMouseExited

    private void btnRemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMouseEntered
        // TODO add your handling code here:
        btnRemover.setBackground(new Color(235,235,235));
        btnRemover.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_btnRemoverMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        // TODO add your handling code here:
        btnCancelar.setBackground(new Color(153,153,153));
        btnCancelar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        // TODO add your handling code here:
        btnCancelar.setBackground(new Color(235,235,235));
        btnCancelar.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnSalvarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdActionPerformed
        // TODO add your handling code here:
        if(modoTela.equals("Criar"))
        {
            //Passo ao controller a entrada do usuário e peço para salvar no banco de dados
            if(ProdutoController.salvarProduto(jtNome.getText(),jfValor.getText(), jtQuanti.getText(), jcFornecedor.getName()))
            {
                //Recarrego a tabela com os dados resgatados do banco de dados
                this.CarregarTabela();

                JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso!");
                LimparFormulario();
            }else{
                JOptionPane.showMessageDialog(null,"Falha ao cadastrar Produto!");
            }

        }else
        {

            //Passo ao controller a entrada do usuário e peço para atualizar o banco de dados
            if(ProdutoController.atualizarProduto(Integer.parseInt(jblIDP.getText()), jtNome.getText(),jfValor.getText(), jtQuanti.getText(), jcFornecedor.getName()))
            {
                //Recarrego a tabela com os dados resgatados do banco de dados
                this.CarregarTabela();
                JOptionPane.showMessageDialog(this,"Produto atualizado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(this,"Falha ao atualizar dados do Produto!");
            }

        }

        LimparFormulario();
        DesabilitarFormulario();
    }//GEN-LAST:event_btnSalvarProdActionPerformed

    private void btnSalvarProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarProdMouseExited
        // TODO add your handling code here:
        btnSalvarProd.setBackground(new Color(153,153,153));
        btnSalvarProd.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnSalvarProdMouseExited

    private void btnSalvarProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarProdMouseEntered
        // TODO add your handling code here:
        btnSalvarProd.setBackground(new Color(235,235,235));
        btnSalvarProd.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_btnSalvarProdMouseEntered

    private void jtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeActionPerformed

    private void jcFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcFornecedorActionPerformed
        // TODO add your handling code here:
        
        jtNomeForn.getText();
        
    }//GEN-LAST:event_jcFornecedorActionPerformed

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
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            
        } catch (InstantiationException ex) {
            
        } catch (IllegalAccessException ex) {
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton bntEditar;
    private javax.swing.JButton bntNovo;
    private javax.swing.JButton bntPesquisar;
    private javax.swing.JButton bntRemover;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvarProd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jblBairro;
    private javax.swing.JLabel jblCEP;
    private javax.swing.JLabel jblCNPJ;
    private javax.swing.JLabel jblCampBairro;
    private javax.swing.JLabel jblCampCEP;
    private javax.swing.JLabel jblCampCNPJ;
    private javax.swing.JLabel jblCampCidade;
    private javax.swing.JLabel jblCampEndereco;
    private javax.swing.JLabel jblCampNome;
    private javax.swing.JLabel jblCampTel;
    private javax.swing.JLabel jblCampUF;
    private javax.swing.JLabel jblCidade;
    private javax.swing.JLabel jblEndereco;
    private javax.swing.JLabel jblFornecedor;
    private javax.swing.JLabel jblID;
    private javax.swing.JLabel jblID1;
    private javax.swing.JLabel jblIDF;
    private javax.swing.JLabel jblIDP;
    private javax.swing.JLabel jblNome;
    private javax.swing.JLabel jblNomeForn;
    private javax.swing.JLabel jblQuant;
    private javax.swing.JLabel jblTel;
    private javax.swing.JLabel jblUF;
    private javax.swing.JLabel jblValor;
    private javax.swing.JComboBox<String> jcFornecedor;
    private javax.swing.JFormattedTextField jfCEP;
    private javax.swing.JFormattedTextField jfCNPJ;
    private javax.swing.JFormattedTextField jfTelefone;
    private javax.swing.JFormattedTextField jfValor;
    private javax.swing.JScrollPane jsTabela;
    private javax.swing.JTextField jtBairro;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNomeForn;
    private javax.swing.JTextField jtPesquisar;
    private javax.swing.JTextField jtPesquisar1;
    private javax.swing.JTextField jtQuanti;
    private javax.swing.JTextField jtUF;
    // End of variables declaration//GEN-END:variables
}
