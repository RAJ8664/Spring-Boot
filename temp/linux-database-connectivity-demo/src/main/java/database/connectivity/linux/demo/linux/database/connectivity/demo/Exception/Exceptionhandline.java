package database.connectivity.linux.demo.linux.database.connectivity.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class Exceptionhandline extends RuntimeException {
		public ResponseEntity<?> Professor_Exception_handling() {
			
			return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
		}
}
