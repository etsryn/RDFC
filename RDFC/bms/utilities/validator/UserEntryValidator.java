package bms.utilities.validator;
import javax.swing.text.*;

import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;


public class UserEntryValidator {

    public JTextField createNumericTextField() {
        JTextField textField = new JTextField();
        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        return textField;
    }

    static class NumericDocumentFilter extends DocumentFilter {
        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            StringBuilder sb = new StringBuilder();
            sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
            sb.insert(offset, string);

            if (isNumeric(sb.toString())) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            StringBuilder sb = new StringBuilder();
            sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
            sb.replace(offset, offset + length, text);

            if (isNumeric(sb.toString())) {
                super.replace(fb, offset, length, text, attrs);
            }
        }

        private boolean isNumeric(String str) {
            // return str.matches("-?\\d+(\\.\\d*)?");  // Regular expression to match integers or decimals
            return str.matches("-?\\d+(\\.\\d+)?");  // Regular expression to match integers
        }
    }
    public JTextField createFloatingNumericTextField() {
        JTextField textField = new JTextField();

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                    // If character is not a digit, dot, or backspace, consume event and beep
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                } else if (c == '.' && textField.getText().contains(".")) {
                    // If dot is already present in the text field, consume event and beep
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });
    
        return textField;
    }
}
