package io.miranum.platform.tasklist.adapter.out.user;

import io.miranum.platform.tasklist.application.port.out.user.UserNotFoundException;
import io.miranum.platform.tasklist.application.port.out.user.UserProfilePort;
import io.miranum.platform.tasklist.domain.UserProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;

@RequiredArgsConstructor
public class MockUserProfileAdapter implements UserProfilePort {

  private final UserProfile user = new UserProfile(
      "123456789",
      "John",
      "Doe",
      MockUserGroupResolverAdapter.PRIMARY_USERGROUP
  );

  @Override
  @NonNull
  public UserProfile findUser(@NonNull final String userId) throws UserNotFoundException {
    return this.user;
  }
}
