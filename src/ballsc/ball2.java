/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ballsc;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @nueng
 */
public class ball2 implements Serializable {
    
    public static final String INPUTVALUE_PROPERTY = "inputValue";
    
    private String inputValue;
    
    private PropertyChangeSupport propertySupport;
    
    public ball2() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getInputValue() {
        return inputValue;
    }
    
    public void setInputValue(String inputValue) {
        String oldValue = this.inputValue;
        this.inputValue = inputValue;
        propertySupport.firePropertyChange(INPUTVALUE_PROPERTY, oldValue, this.inputValue);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
