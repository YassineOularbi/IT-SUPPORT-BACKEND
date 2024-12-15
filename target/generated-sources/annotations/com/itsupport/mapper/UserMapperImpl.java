package com.itsupport.mapper;

import com.itsupport.dto.UserDto;
import com.itsupport.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-15T01:38:15+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.5 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setFullName( user.getFullName() );
        userDto.setMail( user.getMail() );
        userDto.setUsername( user.getUsername() );
        userDto.setPhone( user.getPhone() );
        userDto.setAddress( user.getAddress() );
        userDto.setAvatarUrl( user.getAvatarUrl() );
        userDto.setRole( user.getRole() );

        return userDto;
    }
}
