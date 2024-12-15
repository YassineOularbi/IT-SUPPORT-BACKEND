package com.itsupport.mapper;

import com.itsupport.dto.TicketDto;
import com.itsupport.model.Ticket;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-15T03:04:02+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.5 (Amazon.com Inc.)"
)
@Component
public class TicketMapperImpl implements TicketMapper {

    @Override
    public Ticket toEntity(TicketDto ticketDto) {
        if ( ticketDto == null ) {
            return null;
        }

        Ticket ticket = new Ticket();

        ticket.setDescription( ticketDto.getDescription() );

        return ticket;
    }
}
