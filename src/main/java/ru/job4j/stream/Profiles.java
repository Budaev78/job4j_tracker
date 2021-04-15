package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        List<Address> addressList = new ArrayList<>();
        for (Profile profile : profiles) {
            addressList.add(profile.getAddress());
        }
        addressList.sort(new AddressSortByCity());
        List<Profile> prof = new ArrayList<>();
        for (Address address : addressList) {
            prof.add(new Profile(address));
        }
        return prof.stream().map(
                Profile::getAddress
        ).collect(Collectors.toList());
    }
}
