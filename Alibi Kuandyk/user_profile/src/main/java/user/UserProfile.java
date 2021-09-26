package user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfile {
    @PostMapping("api/change-password")
    void changePassword(@RequestBody NewPassword user, Authentication authentication) {

        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        Objects.equals(userDetails.getUsername(), user.getUsername());

        //TODO check the username matches and implement change password functionality

    }
}
