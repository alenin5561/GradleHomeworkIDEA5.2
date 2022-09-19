import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.open;
import static data.DataGenerator.Registration.getRegisteredUser;
import static data.DataGenerator.Registration.getUser;
import static data.DataGenerator.getRandomLogin;
import static data.DataGenerator.getRandomPassword;

public class Test {

        @BeforeEach
        void setup() {
            open("http://localhost:9999");
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Should successfully login with active registered user")
        void shouldSuccessfulLoginIfRegisteredActiveUser() {
            var registeredUser = getRegisteredUser("active");
            // TODO: добавить логику теста, в рамках которого будет выполнена попытка входа в личный кабинет с учётными
            //  данными зарегистрированного активного пользователя, для заполнения полей формы используйте
            //  пользователя registeredUser
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Should get error message if login with not registered user")
        void shouldGetErrorIfNotRegisteredUser() {
            var notRegisteredUser = getUser("active");
            // TODO: добавить логику теста в рамках которого будет выполнена попытка входа в личный кабинет
            //  незарегистрированного пользователя, для заполнения полей формы используйте пользователя notRegisteredUser
        }

       @org.junit.jupiter.api.Test
        @DisplayName("Should get error message if login with blocked registered user")
        void shouldGetErrorIfBlockedUser() {
            var blockedUser = getRegisteredUser("blocked");
            // TODO: добавить логику теста в рамках которого будет выполнена попытка входа в личный кабинет,
            //  заблокированного пользователя, для заполнения полей формы используйте пользователя blockedUser
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Should get error message if login with wrong login")
        void shouldGetErrorIfWrongLogin() {
            var registeredUser = getRegisteredUser("active");
            var wrongLogin = getRandomLogin();
            // TODO: добавить логику теста в рамках которого будет выполнена попытка входа в личный кабинет с неверным
            //  логином, для заполнения поля формы "Логин" используйте переменную wrongLogin,
            //  "Пароль" - пользователя registeredUser
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Should get error message if login with wrong password")
        void shouldGetErrorIfWrongPassword() {
            var registeredUser = getRegisteredUser("active");
            var wrongPassword = getRandomPassword();
            // TODO: добавить логику теста в рамках которого будет выполнена попытка входа в личный кабинет с неверным
            //  паролем, для заполнения поля формы "Логин" используйте пользователя registeredUser,
            //  "Пароль" - переменную wrongPassword
        }
    }