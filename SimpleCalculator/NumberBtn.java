package SimpleCalculator;

import java.awt.Color;

import javax.swing.JButton;

/*
 * ���ְ�ť�����
 */
public class NumberBtn extends JButton {
	// ��Ա�������������ְ�ť����Ӧ�����ּ�
	private int number;

	/*
	 * ���췽��
	 */
	public NumberBtn(int number) {
		this.number = number;
		this.setText("" + number);
		setForeground(Color.blue);// ��������������ɫ
	}

	/*
	 * �������ĵ���
	 */
	public int getNumber() {
		return number;
	}

}
