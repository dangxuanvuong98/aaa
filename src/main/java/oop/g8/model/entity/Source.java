package oop.g8.model.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(callSuper = true, includeFieldNames = true)
@NoArgsConstructor
@AllArgsConstructor
public class Source {

	private String link;
	private Date date;

}
