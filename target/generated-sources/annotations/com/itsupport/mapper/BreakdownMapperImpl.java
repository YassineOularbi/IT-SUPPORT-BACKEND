package com.itsupport.mapper;

import com.itsupport.dto.BreakdownDto;
import com.itsupport.model.Breakdown;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-15T03:04:02+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.5 (Amazon.com Inc.)"
)
@Component
public class BreakdownMapperImpl implements BreakdownMapper {

    @Override
    public Breakdown toEntity(BreakdownDto breakdownDto) {
        if ( breakdownDto == null ) {
            return null;
        }

        Breakdown breakdown = new Breakdown();

        breakdown.setName( breakdownDto.getName() );
        breakdown.setDescription( breakdownDto.getDescription() );
        breakdown.setPriority( breakdownDto.getPriority() );
        breakdown.setType( breakdownDto.getType() );

        return breakdown;
    }

    @Override
    public Breakdown partialUpdate(BreakdownDto breakdownDto, Breakdown breakdown) {
        if ( breakdownDto == null ) {
            return breakdown;
        }

        breakdown.setName( breakdownDto.getName() );
        breakdown.setDescription( breakdownDto.getDescription() );
        breakdown.setPriority( breakdownDto.getPriority() );
        breakdown.setType( breakdownDto.getType() );

        return breakdown;
    }
}
