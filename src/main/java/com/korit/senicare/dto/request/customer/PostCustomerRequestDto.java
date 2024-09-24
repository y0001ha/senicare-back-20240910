package com.korit.senicare.dto.request.customer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostCustomerRequestDto {

    private String profileImage;

    private String name;

    private String birth;

    private String charger;

    private String address;
    
    private String location;

    
}
