package com.senna.hexagonal.adapters.out.client.mapper;

import com.senna.hexagonal.adapters.out.client.response.AddressResponse;
import com.senna.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
