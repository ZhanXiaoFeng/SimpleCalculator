package SimpleCalculator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;

import javax.swing.JTextField;

/*
 * ���㹦�ܵ��¼�������
 */
public class ClearListener extends BaseListerner {
	public ClearListener(LinkedList<String> list, JTextField resultShow) {
		super(list, resultShow);
	}

	/*
	 * �¼���������
	 */
	public void actionPerformed(ActionEvent e) {
		this.resultShow.setText("0");
		this.list.clear();
	}

}
