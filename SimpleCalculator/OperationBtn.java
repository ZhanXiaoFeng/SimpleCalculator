package SimpleCalculator;

import java.awt.Color;

import javax.swing.JButton;

/*
 * �������������������ť����
 */
public class OperationBtn extends JButton {

	String operateStr;

	public String getOpStr() {
		return operateStr;
	}

	public OperationBtn(String str) {
		operateStr = str;
		this.setText(str);
		setForeground(Color.red);
	}

}
