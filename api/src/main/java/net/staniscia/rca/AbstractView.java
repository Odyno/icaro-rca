/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.staniscia.rca;

/**
 * Vista Utilizzabile.
 */
public abstract class AbstractView extends AbstractContent implements View {


    @Override
    public String getId(){
        if (NO_TITLE.equals(getTitle())){
        return getClass().getName();
        }else{
            return getTitle();
        }
    }

	/* (non-Javadoc)
	 * @see net.staniscia.rca.View#getDefaultPosition()
	 */
	@Override
	public VIEW_ANCHOR getDefaultPosition() {
		return VIEW_ANCHOR.RIGHT;
	}

	/* (non-Javadoc)
	 * @see net.staniscia.rca.View#getDefaultType()
	 */
	@Override
	public VIEW_TYPE getDefaultType() {
		return VIEW_TYPE.SLIDING;
	}


}
