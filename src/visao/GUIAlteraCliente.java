/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ClienteVO;
import modelo.EnderecoVO;
import servicos.ClienteServicos;
import servicos.ServicosFactory;

/**
 *
 * @author André Luiz & Eduardo Gautier
 * @since 10/07/2018 - 21h17
 * @version 1.0 meta charset
 */
public class GUIAlteraCliente extends javax.swing.JInternalFrame {

    private final DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{
                "Código",
                "Nome",
                "CPF",
                "Sexo",
                "Idade",
                "Rua", "Nº",
                "Bairro",
                "Cidade",
                "Estado"
            }
    );
    GUIBuscaCliente objClienteGUI = new GUIBuscaCliente();

    /**
     * Creates new form GUIAlteraCliente
     */
    public GUIAlteraCliente() {
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

        bgSexo = new javax.swing.ButtonGroup();
        jlpAlterar = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        jlIdade = new javax.swing.JLabel();
        jlSexo = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtCpf = new javax.swing.JTextField();
        jtIdade = new javax.swing.JTextField();
        jrbMasculino = new javax.swing.JRadioButton();
        jrbFeminino = new javax.swing.JRadioButton();
        jrbOutros = new javax.swing.JRadioButton();
        jlRua = new javax.swing.JLabel();
        jtRua = new javax.swing.JTextField();
        jlN = new javax.swing.JLabel();
        jtN = new javax.swing.JTextField();
        jtBairro = new javax.swing.JTextField();
        jlBairro = new javax.swing.JLabel();
        jlCidade = new javax.swing.JLabel();
        jtCidade = new javax.swing.JTextField();
        jlEstado = new javax.swing.JLabel();
        jtEstado = new javax.swing.JTextField();
        jbConfirmar = new javax.swing.JButton();
        jlCod = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Alterar Dados do Cliente");

        jlpAlterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlNome.setText("Nome:");

        jlCpf.setText("CPF:");

        jlIdade.setText("Idade:");

        jlSexo.setText("Sexo:");

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

        jtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtCpfFocusLost(evt);
            }
        });
        jtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtCpfKeyPressed(evt);
            }
        });

        jtIdade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtIdadeFocusLost(evt);
            }
        });
        jtIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtIdadeKeyPressed(evt);
            }
        });

        bgSexo.add(jrbMasculino);
        jrbMasculino.setText("Masculino");
        jrbMasculino.setActionCommand("Masculino");
        jrbMasculino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrbMasculinoKeyPressed(evt);
            }
        });

        bgSexo.add(jrbFeminino);
        jrbFeminino.setText("Feminino");
        jrbFeminino.setActionCommand("Feminino");
        jrbFeminino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrbFemininoKeyPressed(evt);
            }
        });

        bgSexo.add(jrbOutros);
        jrbOutros.setText("Outros");
        jrbOutros.setActionCommand("Outros");
        jrbOutros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrbOutrosKeyPressed(evt);
            }
        });

        jlRua.setText("Rua:");

        jtRua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtRuaFocusLost(evt);
            }
        });
        jtRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtRuaKeyPressed(evt);
            }
        });

        jlN.setText("Nº:");

        jtN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNFocusLost(evt);
            }
        });
        jtN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNKeyPressed(evt);
            }
        });

        jtBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtBairroFocusLost(evt);
            }
        });
        jtBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtBairroKeyPressed(evt);
            }
        });

        jlBairro.setText("Bairro:");

        jlCidade.setText("Cidade:");

        jtCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtCidadeFocusLost(evt);
            }
        });
        jtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtCidadeKeyPressed(evt);
            }
        });

        jlEstado.setText("Estado:");

        jtEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtEstadoFocusLost(evt);
            }
        });
        jtEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtEstadoKeyPressed(evt);
            }
        });

        jbConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ok.png"))); // NOI18N
        jbConfirmar.setText("Confirmar Alteração");
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });
        jbConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbConfirmarKeyPressed(evt);
            }
        });

        jlCod.setText("Código:");

        jtCodigo.setEnabled(false);

        jlpAlterar.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jrbMasculino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jrbFeminino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jrbOutros, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlRua, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtRua, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtBairro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlBairro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jbConfirmar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlCod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAlterarLayout = new javax.swing.GroupLayout(jlpAlterar);
        jlpAlterar.setLayout(jlpAlterarLayout);
        jlpAlterarLayout.setHorizontalGroup(
            jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpAlterarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbConfirmar)
                        .addGap(10, 10, 10))
                    .addGroup(jlpAlterarLayout.createSequentialGroup()
                        .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jlpAlterarLayout.createSequentialGroup()
                                .addComponent(jlCod)
                                .addGap(18, 18, 18)
                                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNome)
                                    .addComponent(jlIdade))
                                .addGap(23, 23, 23)
                                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jlpAlterarLayout.createSequentialGroup()
                                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlCpf)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpAlterarLayout.createSequentialGroup()
                                        .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jlpAlterarLayout.createSequentialGroup()
                                                .addComponent(jlBairro)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jlpAlterarLayout.createSequentialGroup()
                                                .addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jlSexo)
                                                .addGap(18, 18, 18)
                                                .addComponent(jrbMasculino)
                                                .addGap(18, 18, 18)
                                                .addComponent(jrbFeminino)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbOutros))))
                            .addGroup(jlpAlterarLayout.createSequentialGroup()
                                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCidade)
                                    .addComponent(jlRua))
                                .addGap(18, 18, 18)
                                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jlpAlterarLayout.createSequentialGroup()
                                        .addComponent(jtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jlN))
                                    .addGroup(jlpAlterarLayout.createSequentialGroup()
                                        .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlEstado)))
                                .addGap(18, 18, 18)
                                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtN, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(jtEstado))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jlpAlterarLayout.setVerticalGroup(
            jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCod)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCpf))
                .addGap(18, 18, 18)
                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIdade)
                    .addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSexo)
                    .addComponent(jrbMasculino)
                    .addComponent(jrbFeminino)
                    .addComponent(jrbOutros))
                .addGap(18, 18, 18)
                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRua)
                    .addComponent(jtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlN)
                    .addComponent(jtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlBairro))
                .addGap(18, 18, 18)
                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCidade)
                    .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEstado)
                    .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbConfirmar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarAlteracao() {
        try {
            ClienteVO objCliente = new ClienteVO();
            EnderecoVO objEndereco = new EnderecoVO();

            objCliente.setIdCliente(Long.parseLong(jtCodigo.getText()));

            if (!jtNome.getText().isEmpty()) {
                objCliente.setNome(jtNome.getText());
            } else {
                throw new NumberFormatException("Nome Inválido!");
            }
            if (!jtCpf.getText().isEmpty()) {
                objCliente.setCpf(Long.parseLong(jtCpf.getText()));
            } else {
                throw new NumberFormatException("Cpf Inválido!");
            }
            if (!jtIdade.getText().isEmpty()) {
                objCliente.setIdade(Byte.parseByte(jtIdade.getText()));
            } else {
                throw new NumberFormatException("Idade Inválida!");
            }
            if (bgSexo.getSelection() != null) {
                objCliente.setSexo(bgSexo.getSelection().getActionCommand());
            } else {
                throw new NumberFormatException("Informe o Sexo!");
            }
            if (!jtRua.getText().isEmpty()) {
                objEndereco.setRua(jtRua.getText());
            } else {
                throw new NumberFormatException("Rua Inválida!");
            }
            if (!jtN.getText().isEmpty()) {
                objEndereco.setNumero(Integer.parseInt(jtN.getText()));
            } else {
                throw new NumberFormatException("Numero Inválido!");
            }
            if (!jtBairro.getText().isEmpty()) {
                objEndereco.setBairro(jtBairro.getText());
            } else {
                throw new NumberFormatException("Bairro Inválido!");
            }
            if (!jtCidade.getText().isEmpty()) {
                objEndereco.setCidade(jtCidade.getText());
            } else {
                throw new NumberFormatException("Cidade Inválida!");
            }
            if (!jtEstado.getText().isEmpty()) {
                objEndereco.setEstado(jtEstado.getText());
            } else {
                throw new NumberFormatException("Estado Inválido!");
            }

            objCliente.setEndereco(objEndereco);

            ClienteServicos CS = ServicosFactory.getClienteServicos();
            CS.alterarCliente(objCliente);
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Alteração Efetuada com Sucesso!",
                    "Sistema",
                    JOptionPane.PLAIN_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Algum erro aconteceu!" + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpar() {
        jtCodigo.setText(null);
        jtNome.setText(null);
        jtCpf.setText(null);
        bgSexo.clearSelection();
        jtIdade.setText(null);
        jtRua.setText(null);
        jtN.setText(null);
        jtBairro.setText(null);
        jtCidade.setText(null);
        jtEstado.setText(null);

    }
    private void jtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNomeFocusLost
        if (jtNome.getText().isEmpty()) {
            jtNome.setBackground(Color.decode("#FFFFF0"));
            jtNome.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtNome.setBackground(Color.white);
            jtNome.setBorder(BorderFactory.createLineBorder(Color.gray));
        }
    }//GEN-LAST:event_jtNomeFocusLost

    private void jtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtCpf.grabFocus();
        }
    }//GEN-LAST:event_jtNomeKeyPressed

    private void jtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCpfFocusLost
        if (jtCpf.getText().isEmpty()) {
            jtCpf.setBackground(Color.decode("#FFFFF0"));
            jtCpf.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtCpf.setBackground(Color.white);
            jtCpf.setBorder(BorderFactory.createLineBorder(Color.gray));
        }
    }//GEN-LAST:event_jtCpfFocusLost

    private void jtCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCpfKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtIdade.grabFocus();
        }
    }//GEN-LAST:event_jtCpfKeyPressed

    private void jtIdadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtIdadeFocusLost
        if (jtIdade.getText().isEmpty()) {
            jtIdade.setBackground(Color.decode("#FFFFF0"));
            jtIdade.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtIdade.setBackground(Color.white);
            jtIdade.setBorder(BorderFactory.createLineBorder(Color.gray));
        }
    }//GEN-LAST:event_jtIdadeFocusLost

    private void jtIdadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jrbMasculino.grabFocus();
        }
    }//GEN-LAST:event_jtIdadeKeyPressed

    private void jrbMasculinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrbMasculinoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jrbFeminino.grabFocus();
        }
    }//GEN-LAST:event_jrbMasculinoKeyPressed

    private void jrbFemininoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrbFemininoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jrbOutros.grabFocus();
        }
    }//GEN-LAST:event_jrbFemininoKeyPressed

    private void jrbOutrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrbOutrosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtRua.grabFocus();
        }
    }//GEN-LAST:event_jrbOutrosKeyPressed

    private void jtRuaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtRuaFocusLost
        if (jtRua.getText().isEmpty()) {
            jtRua.setBackground(Color.decode("#FFFFF0"));
            jtRua.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtRua.setBackground(Color.white);
            jtRua.setBorder(BorderFactory.createLineBorder(Color.gray));
        }
    }//GEN-LAST:event_jtRuaFocusLost

    private void jtRuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtRuaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtN.grabFocus();
        }
    }//GEN-LAST:event_jtRuaKeyPressed

    private void jtNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNFocusLost
        if (jtN.getText().isEmpty()) {
            jtN.setBackground(Color.decode("#FFFFF0"));
            jtN.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtN.setBackground(Color.white);
            jtN.setBorder(BorderFactory.createLineBorder(Color.gray));
        }
    }//GEN-LAST:event_jtNFocusLost

    private void jtNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtBairro.grabFocus();
        }
    }//GEN-LAST:event_jtNKeyPressed

    private void jtBairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtBairroFocusLost
        if (jtBairro.getText().isEmpty()) {
            jtBairro.setBackground(Color.decode("#FFFFF0"));
            jtBairro.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtBairro.setBackground(Color.white);
            jtBairro.setBorder(BorderFactory.createLineBorder(Color.gray));
        }
    }//GEN-LAST:event_jtBairroFocusLost

    private void jtBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBairroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtCidade.grabFocus();
        }
    }//GEN-LAST:event_jtBairroKeyPressed

    private void jtCidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCidadeFocusLost
        if (jtCidade.getText().isEmpty()) {
            jtCidade.setBackground(Color.decode("#FFFFF0"));
            jtCidade.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtCidade.setBackground(Color.white);
            jtCidade.setBorder(BorderFactory.createLineBorder(Color.gray));
        }
    }//GEN-LAST:event_jtCidadeFocusLost

    private void jtCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtEstado.grabFocus();
        }
    }//GEN-LAST:event_jtCidadeKeyPressed

    private void jtEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtEstadoFocusLost
        if (jtEstado.getText().isEmpty()) {
            jtEstado.setBackground(Color.decode("#FFFFF0"));
            jtEstado.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            jtEstado.setBackground(Color.white);
            jtEstado.setBorder(BorderFactory.createLineBorder(Color.gray));
        }
    }//GEN-LAST:event_jtEstadoFocusLost

    private void jtEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtEstadoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            confirmarAlteracao();
            limpar();
            dispose();
        }
    }//GEN-LAST:event_jtEstadoKeyPressed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        confirmarAlteracao();
        limpar();
        dispose();
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jbConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbConfirmarKeyPressed
        confirmarAlteracao();
        limpar();
        dispose();
    }//GEN-LAST:event_jbConfirmarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlCod;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlIdade;
    private javax.swing.JLabel jlN;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlRua;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JLayeredPane jlpAlterar;
    public static javax.swing.JRadioButton jrbFeminino;
    public static javax.swing.JRadioButton jrbMasculino;
    public static javax.swing.JRadioButton jrbOutros;
    public static javax.swing.JTextField jtBairro;
    public static javax.swing.JTextField jtCidade;
    public static javax.swing.JTextField jtCodigo;
    public static javax.swing.JTextField jtCpf;
    public static javax.swing.JTextField jtEstado;
    public static javax.swing.JTextField jtIdade;
    public static javax.swing.JTextField jtN;
    public static javax.swing.JTextField jtNome;
    public static javax.swing.JTextField jtRua;
    // End of variables declaration//GEN-END:variables

}