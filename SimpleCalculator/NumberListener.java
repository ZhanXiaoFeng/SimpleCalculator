package SimpleCalculator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;

import javax.swing.JTextField;

/*
 * ���֣�0123456789�����¼�������
 */
public class NumberListener extends BaseListerner {

	/*
	 * ���췽��
	 */
	public NumberListener(LinkedList<String> list, JTextField resultShow) {
		super(list, resultShow);
	}

	/*
	 * ���֣�0123456789�����¼���������
	 */
	public void actionPerformed(ActionEvent e) {
		NumberBtn b = (NumberBtn) e.getSource();
		switch (list.size()) {
		case 0: {
			int number = b.getNumber();
			list.add("" + number);
			resultShow.setText("" + number);
		}
			break;

		case 1: {
			int number = b.getNumber();
			String num = list.getFirst();
			String s = num.concat("" + number);
			list.set(0, s);
			resultShow.setText(s);
		}
			break;

		case 2: {
			int number = b.getNumber();
			list.add("" + number);
			resultShow.setText("" + number);
		}
			break;

		case 3: {
			int number = b.getNumber();
			String num = list.getLast();
			String s = num.concat("" + number);
			list.set(2, s);
			resultShow.setText(s);
		}
			break;

		default:
			break;
		}

	}

}
