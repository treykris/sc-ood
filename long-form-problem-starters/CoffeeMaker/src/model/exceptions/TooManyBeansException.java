package model.exceptions;

import model.exceptions.BeansAmountException;

public class TooManyBeansException extends BeansAmountException {

    protected TooManyBeansException(double beans){
        super(beans, " is too many beans");
    }
}
