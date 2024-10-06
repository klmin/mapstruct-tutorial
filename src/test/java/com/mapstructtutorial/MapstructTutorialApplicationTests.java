package com.mapstructtutorial;

import com.mapstructtutorial.mapstruct.car.dto.CarDTO;
import com.mapstructtutorial.mapstruct.car.dto.CompanyDTO;
import com.mapstructtutorial.mapstruct.car.dto.ReservationDTO;
import com.mapstructtutorial.mapstruct.car.dto.UserDTO;
import com.mapstructtutorial.mapstruct.car.entity.Car;
import com.mapstructtutorial.mapstruct.car.entity.User;
import com.mapstructtutorial.mapstruct.car.enums.EnumCarColor;
import com.mapstructtutorial.mapstruct.car.enums.EnumUserStatus;
import com.mapstructtutorial.mapstruct.car.mapper.CarMapper;
import com.mapstructtutorial.mapstruct.car.mapper.UserMapper;
import com.mapstructtutorial.mapstruct.car.service.CarService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class MapstructTutorialApplicationTests {

	@Autowired
	CarService carService;

	@Autowired
	UserMapper userMapper;

	@Autowired
	CarMapper carMapper;

	CarDTO carDTO;
	CompanyDTO companyDTO;
	ReservationDTO reservationDTO;

	@BeforeEach
	void setUp() {

		Long id = 1L;
		String name = "소나타";
		Integer price = 3000;
		List<String> options = List.of("Bluetooth", "BlackBox", "Aircon");
		EnumCarColor color = EnumCarColor.White;
		LocalDateTime regDttm = LocalDateTime.now();

		carDTO = CarDTO.builder().id(id).name(name).price(price).options(options).color(color).regDttm(regDttm).build();
		companyDTO = CompanyDTO.builder().companyId(3L).name("현대").build();
		reservationDTO = ReservationDTO.builder().reservationName("홍길동").reservationMobile("01012345678").build();
	}

	@Test
	void mapStruct(){


		Car car = carMapper.toEntity(carDTO,  companyDTO, reservationDTO, "테스트메모", "테스트파라미터");
		System.out.println("car : "+car);

	}

	@Test
	void defaultMapStruct(){
		UserDTO userDTO = UserDTO.builder().userName("홍길동").userId(1L).status(EnumUserStatus.ACTIVE).age(20).build();

		User toEntityUser = userMapper.toEntity(userDTO);
		System.out.println("user : "+toEntityUser);

		User user = User.builder().userName("홍길동2").userId(2L).status(EnumUserStatus.DELETED).age(23).build();
		UserDTO toDTOUser = userMapper.toDto(user);
		System.out.println("toDTOUser : "+toDTOUser);
	}

}
