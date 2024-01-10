package crud;

import java.util.List;

public interface IDao<T> {

	public Boolean create(T objet);
	
	public List<T> read();
}
