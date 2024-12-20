package com.itsupport.mapper;

import com.itsupport.auth.model.RegisterRequest;
import com.itsupport.dto.UserDto;
import com.itsupport.dto.UserUpdateDto;
import com.itsupport.model.Admin;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-15T03:04:01+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.5 (Amazon.com Inc.)"
)
@Component
public class AdminMapperImpl implements AdminMapper {

    @Override
    public Admin toEntity(RegisterRequest registerRequest) {
        if ( registerRequest == null ) {
            return null;
        }

        Admin admin = new Admin();

        admin.setFullName( registerRequest.getFullName() );
        admin.setMail( registerRequest.getMail() );
        admin.setUsername( registerRequest.getUsername() );
        admin.setPassword( registerRequest.getPassword() );
        admin.setPhone( registerRequest.getPhone() );
        admin.setAddress( registerRequest.getAddress() );

        return admin;
    }

    @Override
    public UserDto toDto(Admin admin) {
        if ( admin == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( admin.getId() );
        userDto.setFullName( admin.getFullName() );
        userDto.setMail( admin.getMail() );
        userDto.setUsername( admin.getUsername() );
        userDto.setPhone( admin.getPhone() );
        userDto.setAddress( admin.getAddress() );
        userDto.setAvatarUrl( admin.getAvatarUrl() );
        userDto.setRole( admin.getRole() );

        return userDto;
    }

    @Override
    public Admin partialUpdate(UserUpdateDto userUpdateDto, Admin admin) {
        if ( userUpdateDto == null ) {
            return admin;
        }

        admin.setFullName( userUpdateDto.getFullName() );
        admin.setMail( userUpdateDto.getMail() );
        admin.setUsername( userUpdateDto.getUsername() );
        admin.setPhone( userUpdateDto.getPhone() );
        admin.setAddress( userUpdateDto.getAddress() );

        return admin;
    }
}
