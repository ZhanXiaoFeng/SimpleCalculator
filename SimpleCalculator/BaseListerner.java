package SimpleCalculator;

import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JTextField;

/*
 * ��ť�����¼��ĸ���
 */
public abstract class BaseListerner implements ActionListener {

	/*
	 * ��װͨ������
	 */
	protected LinkedList<String> list;
	protected JTextField resultShow;

	public BaseListerner() {
	}

	public BaseListerner(LinkedList<String> list, JTextField resultShow) {

		super();
		this.list = list;
		this.resultShow = resultShow;
	}

}
