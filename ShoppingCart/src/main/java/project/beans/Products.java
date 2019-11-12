package project.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	
	private String productName;
	
	private double productPrice;
		
	@Enumerated(EnumType.STRING)
	private Category category;
	
	 
}
