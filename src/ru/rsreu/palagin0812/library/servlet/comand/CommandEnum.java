package ru.rsreu.palagin0812.library.servlet.comand;

public enum CommandEnum {
	LOGIN {
		{
			this.command = new LoginCommand();
		}
	},
	LOGOUT {
		{
			this.command = new LogoutCommand();
		}
	},
	LOAD_ALL {
		{
			this.command = new LoadListBuildsCommand();
		}
	},
	USER_BUILDS {
		{
			this.command = new LoadListUserBuildsCommand();
		}
	},
	DELETE {
		{
			this.command = new DeleteCommand();
		}
	},
	USERS_LIST {
		{
			this.command = new LoadListUsersCommand();
		}
	},
	CREATE_USER {
		{
			this.command = new CreateUserCommand();
		}
	},
	CREATE_BUILD {
		{
			this.command = new CreateBuildCommand();
		}
	},

	PROFILE {
		{
			this.command = new ProfileCommand();
		}
	},
	CHANGE_USER_INFO {
		{
			this.command = new ChangeUserInfoCommand();
		}
	},
	CREATION_BUILD {
		{
			this.command = new CreationCommand();
		}
	},
	MAIN {
		{
			this.command = new MainCommand();
		}
	},

	PAGE {
		{
			this.command = new PageCommand();
		}
	};

	ActionCommand command;

	public ActionCommand getCurrentCommand() {
		return command;
	}
}