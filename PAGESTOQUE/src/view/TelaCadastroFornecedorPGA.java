/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerFornecedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import model.ModelFornecedor;

/**
 *
 * @author santo
 */
public class TelaCadastroFornecedorPGA extends javax.swing.JFrame {
ArrayList<ModelFornecedor> listaModelFornecedor = new ArrayList<>();
    ControllerFornecedor controllerFornecedor = new ControllerFornecedor();
    ModelFornecedor modelFornecedor = new ModelFornecedor();
    String SalvarAlterar;    
    
public class UppercaseDocumentFilter extends DocumentFilter {
    @Override
    public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
        fb.insertString(offset, text.toUpperCase(), attr);
    }

    @Override
    public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        fb.replace(offset, length, text.toUpperCase(), attrs);
    }
}        
    public TelaCadastroFornecedorPGA() {
        initComponents();
        
        /*Altera fontes para tudo maiúsculo*/
        UppercaseDocumentFilter uppercaseFilter = new TelaCadastroFornecedorPGA.UppercaseDocumentFilter();
        ((AbstractDocument) jtfCodigo.getDocument()).setDocumentFilter(uppercaseFilter);
        ((AbstractDocument) jtfEmail.getDocument()).setDocumentFilter(uppercaseFilter);
        ((AbstractDocument) jtfRazaoSocial.getDocument()).setDocumentFilter(uppercaseFilter);
        ((AbstractDocument) jtfLogradouro.getDocument()).setDocumentFilter(uppercaseFilter);
        ((AbstractDocument) jtfComplemento.getDocument()).setDocumentFilter(uppercaseFilter);
        ((AbstractDocument) jtfBairro.getDocument()).setDocumentFilter(uppercaseFilter);
        ((AbstractDocument) jtfCidade.getDocument()).setDocumentFilter(uppercaseFilter);
        //((AbstractDocument) jtfUF.getDocument()).setDocumentFilter(uppercaseFilter);
        ((AbstractDocument) jtfPesquisar.getDocument()).setDocumentFilter(uppercaseFilter);
        
        carregarFornecedores();
        habilitarDesabilitarCampos(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFornecedores = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbLimpar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfRazaoSocial = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfInscricaoEstatudal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfLogradouro = new javax.swing.JTextField();
        btFornecedorCadastroFornecedor = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jtfPesquisar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbPesquisar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jtfComplemento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtfBairro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtfCidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btSairCadastroFornecedor = new javax.swing.JButton();
        jtfTelefone = new javax.swing.JFormattedTextField();
        jtfCnpj = new javax.swing.JFormattedTextField();
        jtfCep = new javax.swing.JFormattedTextField();
        jcbUF = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btInicialCadastroFornecedorMenu = new javax.swing.JMenuItem();
        btEncerrarSessaoCadastrofornecedorMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PGA System - Cadastro Fornecedor");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Fornecedor");

        jtFornecedores.setBackground(new java.awt.Color(255, 255, 255));
        jtFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Fornecedor", "Email", "Telefone", "CNPJ", "Razão Social", "Inscrição Estatual", "Logradouro", "Complemento", "Bairro", "Cidade", "UF", "Cep"
            }
        ));
        jScrollPane1.setViewportView(jtFornecedores);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Código:");

        jtfCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jtfCodigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfCodigo.setPreferredSize(new java.awt.Dimension(64, 24));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nome Fantasia:");

        jtfNome.setForeground(new java.awt.Color(255, 255, 255));
        jtfNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfNome.setPreferredSize(new java.awt.Dimension(64, 24));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Email:");

        jtfEmail.setForeground(new java.awt.Color(255, 255, 255));
        jtfEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfEmail.setPreferredSize(new java.awt.Dimension(64, 24));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Telefone:");

        jbLimpar.setBackground(new java.awt.Color(0, 0, 0));
        jbLimpar.setForeground(new java.awt.Color(255, 255, 255));
        jbLimpar.setText("Limpar");
        jbLimpar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jbLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLimpar.setPreferredSize(new java.awt.Dimension(80, 24));
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CNPJ:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Razão Social:");

        jtfRazaoSocial.setForeground(new java.awt.Color(255, 255, 255));
        jtfRazaoSocial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfRazaoSocial.setPreferredSize(new java.awt.Dimension(64, 24));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Inscrição Estadual:");

        jtfInscricaoEstatudal.setForeground(new java.awt.Color(255, 255, 255));
        jtfInscricaoEstatudal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfInscricaoEstatudal.setPreferredSize(new java.awt.Dimension(64, 24));
        jtfInscricaoEstatudal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfInscricaoEstatudalActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Logradouro:");

        jtfLogradouro.setForeground(new java.awt.Color(255, 255, 255));
        jtfLogradouro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfLogradouro.setPreferredSize(new java.awt.Dimension(64, 24));

        btFornecedorCadastroFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        btFornecedorCadastroFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        btFornecedorCadastroFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Graphicloads-100-Flat-2-Arrow-back.24.png"))); // NOI18N
        btFornecedorCadastroFornecedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        btFornecedorCadastroFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFornecedorCadastroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFornecedorCadastroFornecedorActionPerformed(evt);
            }
        });

        jbAlterar.setBackground(new java.awt.Color(0, 0, 0));
        jbAlterar.setForeground(new java.awt.Color(255, 255, 255));
        jbAlterar.setText("Alterar");
        jbAlterar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jbAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAlterar.setPreferredSize(new java.awt.Dimension(80, 24));
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setBackground(new java.awt.Color(0, 0, 0));
        jbExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jbExcluir.setText("Excluir");
        jbExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jbExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExcluir.setPreferredSize(new java.awt.Dimension(80, 24));
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbSalvar.setBackground(new java.awt.Color(0, 0, 0));
        jbSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jbSalvar.setText("Salvar");
        jbSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jbSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalvar.setPreferredSize(new java.awt.Dimension(80, 24));
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        jbCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jbCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCadastrar.setPreferredSize(new java.awt.Dimension(80, 24));
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 153, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Filtro");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 4, true));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setPreferredSize(new java.awt.Dimension(65, 24));

        jtfPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        jtfPesquisar.setForeground(new java.awt.Color(0, 0, 0));
        jtfPesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfPesquisar.setPreferredSize(new java.awt.Dimension(64, 24));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Pesquisar:");

        jbPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        jbPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Custom-Icon-Design-Mono-General-2-Search.16.png"))); // NOI18N
        jbPesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jbPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPesquisar.setPreferredSize(new java.awt.Dimension(20, 16));
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Complemento:");

        jtfComplemento.setForeground(new java.awt.Color(255, 255, 255));
        jtfComplemento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfComplemento.setPreferredSize(new java.awt.Dimension(64, 24));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Bairro:");

        jtfBairro.setForeground(new java.awt.Color(255, 255, 255));
        jtfBairro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfBairro.setPreferredSize(new java.awt.Dimension(64, 24));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Cidade:");

        jtfCidade.setForeground(new java.awt.Color(255, 255, 255));
        jtfCidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfCidade.setPreferredSize(new java.awt.Dimension(64, 24));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("UF:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Cep:");

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Configurações");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setPreferredSize(new java.awt.Dimension(105, 24));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("PGA System - Sistema de Gestão e Controle de Estoque Empresarial");

        btSairCadastroFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        btSairCadastroFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        btSairCadastroFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pictogrammers-Material-Exit-run.16.png"))); // NOI18N
        btSairCadastroFornecedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        btSairCadastroFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSairCadastroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairCadastroFornecedorActionPerformed(evt);
            }
        });

        jtfTelefone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfTelefone.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jtfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfTelefone.setPreferredSize(new java.awt.Dimension(64, 24));

        jtfCnpj.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            jtfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfCnpj.setPreferredSize(new java.awt.Dimension(64, 24));

        try {
            jtfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jcbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jcbUF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jcbUF.setPreferredSize(new java.awt.Dimension(72, 24));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfRazaoSocial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addGap(4, 4, 4))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtfCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfInscricaoEstatudal, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfLogradouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btFornecedorCadastroFornecedor)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(456, 456, 456)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSairCadastroFornecedor)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btFornecedorCadastroFornecedor))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jtfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jtfRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jtfInscricaoEstatudal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jtfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jtfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(btSairCadastroFornecedor))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ionic-Ionicons-Home.16.png"))); // NOI18N
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btInicialCadastroFornecedorMenu.setText("Tela Inicial");
        btInicialCadastroFornecedorMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btInicialCadastroFornecedorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInicialCadastroFornecedorMenuActionPerformed(evt);
            }
        });
        jMenu1.add(btInicialCadastroFornecedorMenu);

        btEncerrarSessaoCadastrofornecedorMenu.setText("Encerrar Sessão");
        btEncerrarSessaoCadastrofornecedorMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEncerrarSessaoCadastrofornecedorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEncerrarSessaoCadastrofornecedorMenuActionPerformed(evt);
            }
        });
        jMenu1.add(btEncerrarSessaoCadastrofornecedorMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Dario-Arnaez-Genesis-3G-User-Files.16.png"))); // NOI18N
        jMenu2.setText("Cadastro");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setText("Funcionário");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Fornecedor");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Cliente");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Double-J-Design-Ravenna-3d-Box.16.png"))); // NOI18N
        jMenu3.setText("Estoque");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem4.setText("Cadastrar Produto");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Excluir Produto");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Alterar Produto");
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.add(jMenuItem6);

        jMenuItem23.setText("Entrada Estoque");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem23);

        jMenuItem24.setText("Saída Estoque");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem24);

        jMenuBar1.add(jMenu3);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icons-Land-Vista-People-Person-Male-Light.16.png"))); // NOI18N
        jMenu6.setText("Pessoa");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem7.setText("Funcionário");
        jMenuItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.add(jMenuItem7);

        jMenuItem8.setText("Cliente");
        jMenuItem8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("Fornecedor");
        jMenuItem9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.add(jMenuItem9);

        jMenuBar1.add(jMenu6);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Custom-Icon-Design-Flatastic-9-Custom-reports.16.png"))); // NOI18N
        jMenu4.setText("Consulta");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem10.setText("Consulta Rápida");
        jMenuItem10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Consulta Avançada");
        jMenuItem11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("Consulta Cliente");
        jMenuItem12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("Consulta Fornecedor");
        jMenuItem13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.add(jMenuItem13);

        jMenuItem14.setText("Consulta Funcionário");
        jMenuItem14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.add(jMenuItem14);

        jMenuBar1.add(jMenu4);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Iconmuseo-Egypt-Cleopatra-09-Contextual-Menu-Items.16.png"))); // NOI18N
        jMenu7.setText("Relatório");
        jMenu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem15.setText("Relatório Cliente");
        jMenuItem15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu7.add(jMenuItem15);

        jMenuItem16.setText("Relatório Fornecedor");
        jMenuItem16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu7.add(jMenuItem16);

        jMenuItem17.setText("Relatório Funcionário");
        jMenuItem17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu7.add(jMenuItem17);

        jMenuItem18.setText("Relatório Movimentação");
        jMenuItem18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu7.add(jMenuItem18);

        jMenuBar1.add(jMenu7);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Arturo-Wibawa-Akar-Gear.16.png"))); // NOI18N
        jMenu5.setText("Configurações");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem19.setText("Configurações de Acesso");
        jMenuItem19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.add(jMenuItem19);

        jMenuBar1.add(jMenu5);

        jMenu8.setText("PGA  System");
        jMenu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem20.setText("Desenvolvedores PGA System");
        jMenuItem20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu8.add(jMenuItem20);

        jMenuItem21.setText("Empresa PGA System");
        jMenuItem21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu8.add(jMenuItem21);

        jMenuItem22.setText("Dúvidas");
        jMenuItem22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu8.add(jMenuItem22);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btEncerrarSessaoCadastrofornecedorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEncerrarSessaoCadastrofornecedorMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btEncerrarSessaoCadastrofornecedorMenuActionPerformed

    private void btInicialCadastroFornecedorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInicialCadastroFornecedorMenuActionPerformed
        
        new TelaLoginPGA().setVisible(true);dispose();
    }//GEN-LAST:event_btInicialCadastroFornecedorMenuActionPerformed

    private void jtfInscricaoEstatudalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfInscricaoEstatudalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfInscricaoEstatudalActionPerformed

    private void btFornecedorCadastroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFornecedorCadastroFornecedorActionPerformed

        new TelaFornecedorPGA().setVisible(true);dispose();
    }//GEN-LAST:event_btFornecedorCadastroFornecedorActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
       int linha = jtFornecedores.getSelectedRow();
        int codigoFornecedor = (int) jtFornecedores.getValueAt(linha, 0);

        if (controllerFornecedor.excluirFornecedorController(codigoFornecedor)) {
            JOptionPane.showMessageDialog(this, "Funcionário excluido com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            carregarFornecedores();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao exlcuir o Funcionário", "ERRO", JOptionPane.ERROR_MESSAGE);
        }                                  
                                            
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void btSairCadastroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairCadastroFornecedorActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btSairCadastroFornecedorActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        System.out.println("Botão de pesquisa clicado.");
        DefaultTableModel modelo = (DefaultTableModel) this.jtFornecedores.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtFornecedores.setRowSorter(classificador);
        String texto = jtfPesquisar.getText();
        System.out.println("Texto de pesquisa: " + texto);
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
        System.out.println("Linhas visíveis: " + this.jtFornecedores.getRowCount());

    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        SalvarAlterar = "salvar";
        habilitarDesabilitarCampos(true);
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        SalvarAlterar = "alterar";
        int linha = this.jtFornecedores.getSelectedRow();
        try {
            int codigoFornecedor = (int) this.jtFornecedores.getValueAt(linha, 0);
            //Recupera dados do banco//
            modelFornecedor = controllerFornecedor.retornarFornecedorController(codigoFornecedor);
            //Setar na interface//
            this.jtfCodigo.setText(String.valueOf(modelFornecedor.getIdFornecedor()));
            this.jtfNome.setText(modelFornecedor.getForNome());
            this.jtfEmail.setText(modelFornecedor.getForEmail());
            this.jtfTelefone.setText(modelFornecedor.getForTelefone());
            this.jtfCnpj.setText(modelFornecedor.getForCNPJ());
            this.jtfRazaoSocial.setText(modelFornecedor.getForRazaoSocial());
            this.jtfInscricaoEstatudal.setText(modelFornecedor.getInscricaoEstadual());
            this.jtfLogradouro.setText(modelFornecedor.getForLogradouro());
            this.jtfComplemento.setText(modelFornecedor.getForComplemento());
            this.jtfBairro.setText(modelFornecedor.getForBairro());
            this.jtfCidade.setText(modelFornecedor.getForCidade());
            //Obter a UF selecionada na ComboBox
        String ufSelecionada = (String) jcbUF.getSelectedItem();
        modelFornecedor.setForUF(ufSelecionada);
            this.jtfCep.setText(modelFornecedor.getForCEP());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "AVISO",JOptionPane.ERROR_MESSAGE);
        }finally{
            carregarFornecedores();
            habilitarDesabilitarCampos(true);
        }
                                           
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
     salvarFornecedor();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        // TODO add your handling code here:
     new TelaEntradaPGA().setVisible(true);dispose();
     
    }//GEN-LAST:event_jMenuItem23ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroFornecedorPGA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedorPGA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedorPGA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedorPGA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFornecedorPGA().setVisible(true);
            }
        });
    }  
    
    /*Salva produto no banco*/
    private void salvarFornecedor(){
        if(SalvarAlterar.equals("salvar")){
        modelFornecedor.setForNome(this.jtfCodigo.getText());
        modelFornecedor.setForEmail(this.jtfEmail.getText());
        modelFornecedor.setForRazaoSocial(this.jtfRazaoSocial.getText());
        modelFornecedor.setInscricaoEstadual(this.jtfInscricaoEstatudal.getText());
        modelFornecedor.setForCNPJ(this.jtfCnpj.getText());
        modelFornecedor.setForTelefone(this.jtfTelefone.getText());
        modelFornecedor.setForLogradouro(this.jtfLogradouro.getText());
        modelFornecedor.setForComplemento(this.jtfComplemento.getText());
        modelFornecedor.setForBairro(this.jtfBairro.getText());
        modelFornecedor.setForCidade(this.jtfCidade.getText());
        //Obter a UF selecionada na ComboBox
        String ufSelecionada = (String) jcbUF.getSelectedItem();
        modelFornecedor.setForUF(ufSelecionada);
        modelFornecedor.setForCEP(this.jtfCep.getText());
      if (controllerFornecedor.salvarFornecedorController(modelFornecedor)){
           JOptionPane.showMessageDialog(this, "Fornecedor cadastrado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
           carregarFornecedores();
           limparCampos();
           habilitarDesabilitarCampos(false);
       }else{
           JOptionPane.showMessageDialog(this, "Erro ao cadastrar o fornecedor!", "ERRO", JOptionPane.ERROR_MESSAGE);
       }
    
        }else if (SalvarAlterar.equals("alterar")){
            this.alterarFornecedor();
            carregarFornecedores();
            
    }    
    } 
           
    private void alterarFornecedor(){
        modelFornecedor.setForNome(this.jtfCodigo.getText());
        modelFornecedor.setForEmail(this.jtfEmail.getText());
        modelFornecedor.setForRazaoSocial(this.jtfRazaoSocial.getText());
        modelFornecedor.setInscricaoEstadual(this.jtfInscricaoEstatudal.getText());
        modelFornecedor.setForCNPJ(this.jtfCnpj.getText());
        modelFornecedor.setForTelefone(this.jtfTelefone.getText());
        modelFornecedor.setForLogradouro(this.jtfLogradouro.getText());
        modelFornecedor.setForComplemento(this.jtfComplemento.getText());
        modelFornecedor.setForBairro(this.jtfBairro.getText());
        modelFornecedor.setForCidade(this.jtfCidade.getText());
       //Obter a UF selecionada na ComboBox
        String ufSelecionada = (String) jcbUF.getSelectedItem();
        modelFornecedor.setForUF(ufSelecionada);
        modelFornecedor.setForCEP(this.jtfCep.getText());
      if (controllerFornecedor.salvarFornecedorController(modelFornecedor)){
           JOptionPane.showMessageDialog(this, "Fornecedor alterado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
           carregarFornecedores();
           limparCampos();
           habilitarDesabilitarCampos(false);
       }else{
           JOptionPane.showMessageDialog(this, "Erro ao alterar o fornecedor!", "ERRO", JOptionPane.ERROR_MESSAGE);
       }
        
    }   
    /*Limpa os campos do formulario*/  
    private void limparCampos(){
        jtfCodigo.setText("");
        jtfEmail.setText("");
        jtfRazaoSocial.setText("");
        jtfInscricaoEstatudal.setText("");
        jtfCnpj.setText("");
        jtfTelefone.setText("");
        jtfLogradouro.setText("");
        jtfComplemento.setText("");
        jtfBairro.setText("");
        //jtfUF.setText("");
        jtfCep.setText("");
        jtfCidade.setText("");
    }
    
    /*Habilita campos para edição*/
    private void habilitarDesabilitarCampos (boolean condicao) {
        jtfCodigo.setEnabled(condicao);
        jtfNome.setEnabled(condicao);
        jtfEmail.setEnabled(condicao);
        jtfRazaoSocial.setEnabled(condicao);
        jtfInscricaoEstatudal.setEnabled(condicao);
        jtfCnpj.setEnabled(condicao);
        jtfTelefone.setEnabled(condicao);
        jtfLogradouro.setEnabled(condicao);
        jtfComplemento.setEnabled(condicao);
        jtfBairro.setEnabled(condicao);
        jcbUF.setEnabled(condicao);
        jtfCep.setEnabled(condicao);
        jtfCidade.setEnabled(condicao);
    }
    
     /**
     * Preenche a tabela de clientes com os clientes cadastrados no banco
     */
    private void carregarFornecedores(){
       listaModelFornecedor = controllerFornecedor.retornarListaFornecedorController();
       DefaultTableModel modelo = (DefaultTableModel) jtFornecedores.getModel();
       modelo.setNumRows(0);
       
       //inserir clientes na tabela
       int cont = listaModelFornecedor.size();
       for (int i = 0; i < cont; i++) {
           modelo.addRow(new Object[]{
           listaModelFornecedor.get(i).getIdFornecedor(),
           listaModelFornecedor.get(i).getForNome(),
           listaModelFornecedor.get(i).getForEmail(),
           listaModelFornecedor.get(i).getForRazaoSocial(),
           listaModelFornecedor.get(i).getInscricaoEstadual(),
           listaModelFornecedor.get(i).getForCNPJ(),
           listaModelFornecedor.get(i).getForTelefone(),
           listaModelFornecedor.get(i).getForLogradouro(),
           listaModelFornecedor.get(i).getForComplemento(), 
           listaModelFornecedor.get(i).getForBairro(),
           listaModelFornecedor.get(i).getForUF(),
           listaModelFornecedor.get(i).getForCEP(),
       });
            
       }
        
        
  
         
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btEncerrarSessaoCadastrofornecedorMenu;
    private javax.swing.JButton btFornecedorCadastroFornecedor;
    private javax.swing.JMenuItem btInicialCadastroFornecedorMenu;
    private javax.swing.JButton btSairCadastroFornecedor;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbUF;
    private javax.swing.JTable jtFornecedores;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JFormattedTextField jtfCep;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JFormattedTextField jtfCnpj;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfComplemento;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfInscricaoEstatudal;
    private javax.swing.JTextField jtfLogradouro;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPesquisar;
    private javax.swing.JTextField jtfRazaoSocial;
    private javax.swing.JFormattedTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
}
