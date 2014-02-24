package net.staniscia.rca.swing.view.widget;

import javax.swing.JComponent;
import javax.swing.JLabel;



public class JC2tStatusBarZone {
	private String id;
	private JComponent panel;
	private String constraint;
	
	
	public JC2tStatusBarZone(String id) {
		this(id,new JLabel());
		
	}
	
	public JC2tStatusBarZone(String id, JComponent panel){
		this(id,panel,"*");
	}
	
	
	public JC2tStatusBarZone(String id, JComponent panel, String constraint) {
		super();
		this.id = id;
		this.panel = panel;
		this.constraint = constraint;
	}
	
	public JComponent getPanel() {
		return panel;
	}
	public void setPanel(JComponent panel) {
		this.panel = panel;
	}
	public String getConstraint() {
		return constraint;
	}
	public void setConstraint(String constraint) {
		this.constraint = constraint;
	}
	public String getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JC2tStatusBarZone other = (JC2tStatusBarZone) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
	
}