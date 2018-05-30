package pl.mrmario.tutorials.spring.owczarek.cz17;

public class Component1 {
	private UsersRepository usersRepository;

	public UsersRepository getUsersRepository() {
		return usersRepository;
	}

	public void setUsersRepository(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
	
	
}
