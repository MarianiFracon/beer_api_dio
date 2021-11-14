package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InsufficientBeerStockException extends Exception{

    public InsufficientBeerStockException(Long id, int quantityToDecrement, int quantity){
        super(String.format("Beers with %s ID have insufficient stock to decrement %s beers. Current stock: %s", id, quantityToDecrement, quantity));
    }
}
