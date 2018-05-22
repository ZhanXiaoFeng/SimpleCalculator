package SimpleCalculator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;
import javax.swing.JTextField;

/*
 * �˸��¼�������
 */
public class BackspaceListener extends BaseListerner {

	public BackspaceListener(LinkedList<String> list, JTextField textField) {
		super(list, textField);
	}

	/*
	 * �˸��¼���������
	 */
	public void actionPerformed(ActionEvent e) {
		switch (this.list.size()) {
		case 1: {
			String num = (String)this.list.getFirst();
			if (num.length() >= 1) {
				num = num.substring(0, num.length() - 1);
				this.list.set(0, num);
				resultShow.setText(num);
			} else {
				this.list.removeLast();
				resultShow.setText("0");
			}
		}
			break;

		case 3: {
			String num = (String )this.list.getFirst();
			if (num.length() >= 1) {
				num = num.substring(0, num.length() - 1);
				this.list.set(2, num);
				resultShow.setText(num);
			} else {
				this.list.removeLast();
				resultShow.setText("0");
			}
			break;
		}
		default:
			break;
		}
	}
}
