/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import modelo.VeiculoVO;
import servicos.ServicosFactory;
import servicos.VeiculoServicos;

/**
 *
 * @author André Luiz Alves & Eduardo Gautier
 * @since 06/07/2018 - 16h23
 * @version 1.0 meta charset
 */
public class GUICadVeiculo extends javax.swing.JInternalFrame {

    VeiculoVO objVeiculo = new VeiculoVO();

    /**
     * Creates new form GUICadVeiculo
     */
    public GUICadVeiculo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgFuel = new javax.swing.ButtonGroup();
        bgPortas = new javax.swing.ButtonGroup();
        jlpDados = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jlMarca = new javax.swing.JLabel();
        jlAno = new javax.swing.JLabel();
        jlModelo = new javax.swing.JLabel();
        jlCombustivel = new javax.swing.JLabel();
        jlValor = new javax.swing.JLabel();
        jlCor = new javax.swing.JLabel();
        jlPortas = new javax.swing.JLabel();
        jlComplementos = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtMarca = new javax.swing.JTextField();
        jtAno = new javax.swing.JTextField();
        jtModelo = new javax.swing.JTextField();
        jtValor = new javax.swing.JTextField();
        jtCor = new javax.swing.JTextField();
        jrbGasolina = new javax.swing.JRadioButton();
        jrbGnv = new javax.swing.JRadioButton();
        jrbEtanol = new javax.swing.JRadioButton();
        jrbDiesel = new javax.swing.JRadioButton();
        jrbFlex = new javax.swing.JRadioButton();
        jrb2p = new javax.swing.JRadioButton();
        jrb3p = new javax.swing.JRadioButton();
        jlpComplementos = new javax.swing.JLayeredPane();
        jcAr = new javax.swing.JCheckBox();
        jcDirecao = new javax.swing.JCheckBox();
        jcAirBag = new javax.swing.JCheckBox();
        jrb4p = new javax.swing.JRadioButton();
        jlpAcoes = new javax.swing.JLayeredPane();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Veículo");

        jlpDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlNome.setText("Nome:");

        jlMarca.setText("Marca:");

        jlAno.setText("Ano:");

        jlModelo.setText("Modelo:");

        jlCombustivel.setText("Combustível:");

        jlValor.setText("Valor de Custo:");

        jlCor.setText("Cor:");

        jlPortas.setText("Portas:");

        jlComplementos.setText("Complementos:");

        jtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNomeFocusLost(evt);
            }
        });
        jtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNomeKeyPressed(evt);
            }
        });

        jtMarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtMarcaFocusLost(evt);
            }
        });
        jtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtMarcaKeyPressed(evt);
            }
        });

        jtAno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtAnoFocusLost(evt);
            }
        });
        jtAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtAnoKeyPressed(evt);
            }
        });

        jtModelo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtModeloFocusLost(evt);
            }
        });
        jtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtModeloKeyPressed(evt);
            }
        });

        jtValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtValorFocusLost(evt);
            }
        });
        jtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtValorKeyPressed(evt);
            }
        });

        jtCor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtCorFocusLost(evt);
            }
        });
        jtCor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtCorKeyPressed(evt);
            }
        });

        bgFuel.add(jrbGasolina);
        jrbGasolina.setText("Gasolina");
        jrbGasolina.setActionCommand("Gasolina");
        jrbGasolina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrbGasolinaKeyPressed(evt);
            }
        });

        bgFuel.add(jrbGnv);
        jrbGnv.setText("GNV");
        jrbGnv.setActionCommand("Gnv");
        jrbGnv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrbGnvKeyPressed(evt);
            }
        });

        bgFuel.add(jrbEtanol);
        jrbEtanol.setText("Etanol");
        jrbEtanol.setActionCommand("Etanol");
        jrbEtanol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrbEtanolKeyPressed(evt);
            }
        });

        bgFuel.add(jrbDiesel);
        jrbDiesel.setText("Diesel");
        jrbDiesel.setActionCommand("Diesel");
        jrbDiesel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrbDieselKeyPressed(evt);
            }
        });

        bgFuel.add(jrbFlex);
        jrbFlex.setText("Flex");
        jrbFlex.setActionCommand("Flex");
        jrbFlex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrbFlexKeyPressed(evt);
            }
        });

        bgPortas.add(jrb2p);
        jrb2p.setText("2");
        jrb2p.setActionCommand("2");
        jrb2p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrb2pKeyPressed(evt);
            }
        });

        bgPortas.add(jrb3p);
        jrb3p.setText("3");
        jrb3p.setActionCommand("3");
        jrb3p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrb3pKeyPressed(evt);
            }
        });

        jlpComplementos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jcAr.setText("Ar Condicionado");
        jcAr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcArKeyPressed(evt);
            }
        });

        jcDirecao.setText("Direção Hidráulica");
        jcDirecao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcDirecaoKeyPressed(evt);
            }
        });

        jcAirBag.setText("AirBag");
        jcAirBag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcAirBagKeyPressed(evt);
            }
        });

        jlpComplementos.setLayer(jcAr, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpComplementos.setLayer(jcDirecao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpComplementos.setLayer(jcAirBag, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpComplementosLayout = new javax.swing.GroupLayout(jlpComplementos);
        jlpComplementos.setLayout(jlpComplementosLayout);
        jlpComplementosLayout.setHorizontalGroup(
            jlpComplementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpComplementosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcAr)
                .addGap(26, 26, 26)
                .addComponent(jcDirecao)
                .addGap(18, 18, 18)
                .addComponent(jcAirBag)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpComplementosLayout.setVerticalGroup(
            jlpComplementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpComplementosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpComplementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcAr)
                    .addComponent(jcDirecao)
                    .addComponent(jcAirBag))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgPortas.add(jrb4p);
        jrb4p.setText("4");
        jrb4p.setActionCommand("4");
        jrb4p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrb4pKeyPressed(evt);
            }
        });

        jlpDados.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlMarca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlAno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlModelo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlCombustivel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlCor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlPortas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlComplementos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtMarca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtAno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtModelo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtCor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jrbGasolina, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jrbGnv, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jrbEtanol, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jrbDiesel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jrbFlex, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jrb2p, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jrb3p, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlpComplementos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jrb4p, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosLayout = new javax.swing.GroupLayout(jlpDados);
        jlpDados.setLayout(jlpDadosLayout);
        jlpDadosLayout.setHorizontalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jlComplementos)
                        .addGap(18, 18, 18)
                        .addComponent(jlpComplementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlCor)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jlValor)
                        .addGap(18, 18, 18)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtCor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlMarca)
                            .addComponent(jlAno)
                            .addComponent(jlModelo)
                            .addComponent(jlNome)
                            .addComponent(jlPortas)
                            .addComponent(jlCombustivel))
                        .addGap(30, 30, 30)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addComponent(jrbGasolina)
                                .addGap(18, 18, 18)
                                .addComponent(jrbGnv)
                                .addGap(18, 18, 18)
                                .addComponent(jrbFlex))
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addComponent(jrbEtanol)
                                .addGap(28, 28, 28)
                                .addComponent(jrbDiesel))
                            .addComponent(jtModelo)
                            .addComponent(jtAno)
                            .addComponent(jtNome)
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addComponent(jrb2p)
                                .addGap(18, 18, 18)
                                .addComponent(jrb3p)
                                .addGap(18, 18, 18)
                                .addComponent(jrb4p))
                            .addComponent(jtMarca))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpDadosLayout.setVerticalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlMarca)
                    .addComponent(jtMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAno)
                    .addComponent(jtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlModelo)
                    .addComponent(jtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValor)
                    .addComponent(jtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCor)
                    .addComponent(jtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCombustivel)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbGasolina)
                            .addComponent(jrbGnv)
                            .addComponent(jrbFlex))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbEtanol)
                            .addComponent(jrbDiesel))))
                .addGap(14, 14, 14)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPortas)
                    .addComponent(jrb2p)
                    .addComponent(jrb3p)
                    .addComponent(jrb4p))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlComplementos)
                    .addComponent(jlpComplementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlpAcoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrar.png"))); // NOI18N
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jbCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCadastrarKeyPressed(evt);
            }
        });

        jbLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar.png"))); // NOI18N
        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jbLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbLimparKeyPressed(evt);
            }
        });

        jlpAcoes.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAcoesLayout = new javax.swing.GroupLayout(jlpAcoes);
        jlpAcoes.setLayout(jlpAcoesLayout);
        jlpAcoesLayout.setHorizontalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jlpAcoesLayout.setVerticalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlpDados)
                    .addComponent(jlpAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlpDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlpAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar() {
        try {
            if (!jtNome.getText().isEmpty()) {
                objVeiculo.setNome(jtNome.getText());
            } else {
                throw new NumberFormatException("Nome Inválido!");
            }
            if (!jtMarca.getText().isEmpty()) {
                objVeiculo.setMarca(jtMarca.getText());
            } else {
                throw new NumberFormatException("Marca Inválida!");
            }
            if (!jtAno.getText().isEmpty()) {
                objVeiculo.setAno(Integer.parseInt(jtAno.getText()));
            } else {
                throw new NumberFormatException("Ano Inválido!");
            }
            if (!jtModelo.getText().isEmpty()) {
                objVeiculo.setModelo(Integer.parseInt(jtModelo.getText()));
            } else {
                throw new NumberFormatException("Modelo Inválido!");
            }
            if (!jtValor.getText().isEmpty()) {
                objVeiculo.setValorCusto(Double.parseDouble(jtValor.getText()));
            } else {
                throw new NumberFormatException("Valor Inválido!");
            }
            if (!jtCor.getText().isEmpty()) {
                objVeiculo.setCor(jtCor.getText());
            } else {
                throw new NumberFormatException("Cor Inválida!");
            }
            if (bgFuel.getSelection() != null) {
                objVeiculo.setCombustivel(bgFuel.getSelection().getActionCommand());
            } else {
                throw new NumberFormatException("Informe o Combustível!");
            }
            if (bgPortas.getSelection() != null) {
                objVeiculo.setPortas(bgPortas.getSelection().getActionCommand());
            } else {
                throw new NumberFormatException("Quantas Portas Tem?!");
            }

            ArrayList<String> complementos = new ArrayList<>();

            if (jcAr.isSelected()) {
                complementos.add("Sim");
            } else {
                complementos.add("Não");
            }
            if (jcDirecao.isSelected()) {
                complementos.add("Sim");
            } else {
                complementos.add("Não");
            }
            if (jcAirBag.isSelected()) {
                complementos.add("Sim");
            } else {
                complementos.add("Não");
            }

            objVeiculo.setComplementos(complementos);

            VeiculoServicos VS = ServicosFactory.getVeiculosServicos();
            VS.cadastrarVeiculo(objVeiculo);

            JOptionPane.showMessageDialog(
                    rootPane,
                    "Cadastro efetuado com sucesso!",
                    "Sistema",
                    JOptionPane.PLAIN_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Algum erro aconteceu!" + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Dados: " + objVeiculo.toString(),
                    "Relatorio",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpar() {
        jtNome.setText(null);
        jtMarca.setText(null);
        jtAno.setText(null);
        jtModelo.setText(null);
        jtValor.setText(null);
        jtCor.setText(null);
        bgFuel.clearSelection();
        bgPortas.clearSelection();
        jcAr.setSelected(false);
        jcDirecao.setSelected(false);
        jcAirBag.setSelected(false);
        jtNome.grabFocus();
    }

    private void jtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtMarca.grabFocus();
        }
    }//GEN-LAST:event_jtNomeKeyPressed

    private void jtMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMarcaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtAno.grabFocus();
        }
    }//GEN-LAST:event_jtMarcaKeyPressed

    private void jtAnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAnoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtModelo.grabFocus();
        }
    }//GEN-LAST:event_jtAnoKeyPressed

    private void jtModeloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtModeloKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtValor.grabFocus();
        }
    }//GEN-LAST:event_jtModeloKeyPressed

    private void jtValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtValorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtCor.grabFocus();
        }
    }//GEN-LAST:event_jtValorKeyPressed

    private void jtCorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jrbGasolina.grabFocus();
        }
    }//GEN-LAST:event_jtCorKeyPressed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        cadastrar();
        limpar();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jrbGasolinaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrbGasolinaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jrbGnv.grabFocus();
        }
    }//GEN-LAST:event_jrbGasolinaKeyPressed

    private void jrbGnvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrbGnvKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jrbFlex.grabFocus();
        }
    }//GEN-LAST:event_jrbGnvKeyPressed

    private void jrbFlexKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrbFlexKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jrbEtanol.grabFocus();
        }
    }//GEN-LAST:event_jrbFlexKeyPressed

    private void jrbEtanolKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrbEtanolKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jrbDiesel.grabFocus();
        }
    }//GEN-LAST:event_jrbEtanolKeyPressed

    private void jrbDieselKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrbDieselKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jrb2p.grabFocus();
        }
    }//GEN-LAST:event_jrbDieselKeyPressed

    private void jrb2pKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrb2pKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jrb3p.grabFocus();
        }
    }//GEN-LAST:event_jrb2pKeyPressed

    private void jrb3pKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrb3pKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jrb4p.grabFocus();
        }
    }//GEN-LAST:event_jrb3pKeyPressed

    private void jrb4pKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrb4pKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jcAr.grabFocus();
        }
    }//GEN-LAST:event_jrb4pKeyPressed

    private void jcArKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcArKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jcDirecao.grabFocus();
        }
    }//GEN-LAST:event_jcArKeyPressed

    private void jcDirecaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcDirecaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jcAirBag.grabFocus();
        }
    }//GEN-LAST:event_jcDirecaoKeyPressed

    private void jcAirBagKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcAirBagKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cadastrar();
            limpar();
        }
    }//GEN-LAST:event_jcAirBagKeyPressed

    private void jtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNomeFocusLost
        if (jtNome.getText().isEmpty()) {
            jtNome.setBackground(Color.decode("#FFFFF0"));
            jtNome.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtNome.setBackground(Color.white);
            jtNome.setBorder(BorderFactory.createLineBorder(Color.gray));
        }
    }//GEN-LAST:event_jtNomeFocusLost

    private void jtMarcaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtMarcaFocusLost
        if (jtMarca.getText().isEmpty()) {
            jtMarca.setBackground(Color.decode("#FFFFF0"));
            jtMarca.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtMarca.setBackground(Color.white);
            jtMarca.setBorder(BorderFactory.createLineBorder(Color.gray));
        }
    }//GEN-LAST:event_jtMarcaFocusLost

    private void jtAnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtAnoFocusLost
         if (jtAno.getText().isEmpty()) {
            jtAno.setBackground(Color.decode("#FFFFF0"));
            jtAno.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtAno.setBackground(Color.white);
            jtAno.setBorder(BorderFactory.createLineBorder(Color.gray));
        }
    }//GEN-LAST:event_jtAnoFocusLost

    private void jtModeloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtModeloFocusLost
        if (jtModelo.getText().isEmpty()) {
            jtModelo.setBackground(Color.decode("#FFFFF0"));
            jtModelo.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtModelo.setBackground(Color.white);
            jtModelo.setBorder(BorderFactory.createLineBorder(Color.gray));
        }
    }//GEN-LAST:event_jtModeloFocusLost

    private void jtValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtValorFocusLost
        if (jtValor.getText().isEmpty()) {
            jtValor.setBackground(Color.decode("#FFFFF0"));
            jtValor.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtValor.setBackground(Color.white);
            jtValor.setBorder(BorderFactory.createLineBorder(Color.gray));
        }
    }//GEN-LAST:event_jtValorFocusLost

    private void jtCorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCorFocusLost
        if (jtCor.getText().isEmpty()) {
            jtCor.setBackground(Color.decode("#FFFFF0"));
            jtCor.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtCor.setBackground(Color.white);
            jtCor.setBorder(BorderFactory.createLineBorder(Color.gray));
        }
    }//GEN-LAST:event_jtCorFocusLost

    private void jbCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCadastrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cadastrar();
            limpar();
        }
    }//GEN-LAST:event_jbCadastrarKeyPressed

    private void jbLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbLimparKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            limpar();
        }
    }//GEN-LAST:event_jbLimparKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgFuel;
    private javax.swing.ButtonGroup bgPortas;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JCheckBox jcAirBag;
    private javax.swing.JCheckBox jcAr;
    private javax.swing.JCheckBox jcDirecao;
    private javax.swing.JLabel jlAno;
    private javax.swing.JLabel jlCombustivel;
    private javax.swing.JLabel jlComplementos;
    private javax.swing.JLabel jlCor;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPortas;
    private javax.swing.JLabel jlValor;
    private javax.swing.JLayeredPane jlpAcoes;
    private javax.swing.JLayeredPane jlpComplementos;
    private javax.swing.JLayeredPane jlpDados;
    private javax.swing.JRadioButton jrb2p;
    private javax.swing.JRadioButton jrb3p;
    private javax.swing.JRadioButton jrb4p;
    private javax.swing.JRadioButton jrbDiesel;
    private javax.swing.JRadioButton jrbEtanol;
    private javax.swing.JRadioButton jrbFlex;
    private javax.swing.JRadioButton jrbGasolina;
    private javax.swing.JRadioButton jrbGnv;
    private javax.swing.JTextField jtAno;
    private javax.swing.JTextField jtCor;
    private javax.swing.JTextField jtMarca;
    private javax.swing.JTextField jtModelo;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtValor;
    // End of variables declaration//GEN-END:variables
}
