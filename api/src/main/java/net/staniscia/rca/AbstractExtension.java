package net.staniscia.rca;

/**
 * Estensione generica di RCA.
 */
public abstract class AbstractExtension implements Extension {

    /* (non-Javadoc)
	 * @see net.staniscia.rca.Extension#getId()
	 */
    @Override
	public String getId(){
        return getClass().getName();
    }

    
}
