package org.redlich.publications.db.publications.authors.generated;

import com.speedment.runtime.core.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import org.redlich.publications.db.publications.authors.Authors;
import org.redlich.publications.db.publications.states.States;

/**
 * The generated base implementation of the {@link
 * org.redlich.publications.db.publications.authors.Authors}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAuthorsImpl implements Authors {
    
    private long id;
    private long version;
    private String prefix;
    private String lastName;
    private String firstName;
    private String middleInit;
    private String suffix;
    private String address;
    private String city;
    private long stateId;
    private String zipCode;
    private String homePhone;
    private String cellPhone;
    private String workPhone;
    private String homeEmail;
    private String workEmail;
    
    protected GeneratedAuthorsImpl() {
        
    }
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public long getVersion() {
        return version;
    }
    
    @Override
    public Optional<String> getPrefix() {
        return Optional.ofNullable(prefix);
    }
    
    @Override
    public String getLastName() {
        return lastName;
    }
    
    @Override
    public String getFirstName() {
        return firstName;
    }
    
    @Override
    public Optional<String> getMiddleInit() {
        return Optional.ofNullable(middleInit);
    }
    
    @Override
    public Optional<String> getSuffix() {
        return Optional.ofNullable(suffix);
    }
    
    @Override
    public Optional<String> getAddress() {
        return Optional.ofNullable(address);
    }
    
    @Override
    public Optional<String> getCity() {
        return Optional.ofNullable(city);
    }
    
    @Override
    public long getStateId() {
        return stateId;
    }
    
    @Override
    public String getZipCode() {
        return zipCode;
    }
    
    @Override
    public Optional<String> getHomePhone() {
        return Optional.ofNullable(homePhone);
    }
    
    @Override
    public Optional<String> getCellPhone() {
        return Optional.ofNullable(cellPhone);
    }
    
    @Override
    public Optional<String> getWorkPhone() {
        return Optional.ofNullable(workPhone);
    }
    
    @Override
    public Optional<String> getHomeEmail() {
        return Optional.ofNullable(homeEmail);
    }
    
    @Override
    public Optional<String> getWorkEmail() {
        return Optional.ofNullable(workEmail);
    }
    
    @Override
    public Authors setId(long id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Authors setVersion(long version) {
        this.version = version;
        return this;
    }
    
    @Override
    public Authors setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    
    @Override
    public Authors setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    
    @Override
    public Authors setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    @Override
    public Authors setMiddleInit(String middleInit) {
        this.middleInit = middleInit;
        return this;
    }
    
    @Override
    public Authors setSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }
    
    @Override
    public Authors setAddress(String address) {
        this.address = address;
        return this;
    }
    
    @Override
    public Authors setCity(String city) {
        this.city = city;
        return this;
    }
    
    @Override
    public Authors setStateId(long stateId) {
        this.stateId = stateId;
        return this;
    }
    
    @Override
    public Authors setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }
    
    @Override
    public Authors setHomePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }
    
    @Override
    public Authors setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
        return this;
    }
    
    @Override
    public Authors setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
        return this;
    }
    
    @Override
    public Authors setHomeEmail(String homeEmail) {
        this.homeEmail = homeEmail;
        return this;
    }
    
    @Override
    public Authors setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
        return this;
    }
    
    @Override
    public States findStateId(Manager<States> foreignManager) {
        return foreignManager.stream().filter(States.ID.equal(getStateId())).findAny().orElse(null);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "         + Objects.toString(getId()));
        sj.add("version = "    + Objects.toString(getVersion()));
        sj.add("prefix = "     + Objects.toString(OptionalUtil.unwrap(getPrefix())));
        sj.add("lastName = "   + Objects.toString(getLastName()));
        sj.add("firstName = "  + Objects.toString(getFirstName()));
        sj.add("middleInit = " + Objects.toString(OptionalUtil.unwrap(getMiddleInit())));
        sj.add("suffix = "     + Objects.toString(OptionalUtil.unwrap(getSuffix())));
        sj.add("address = "    + Objects.toString(OptionalUtil.unwrap(getAddress())));
        sj.add("city = "       + Objects.toString(OptionalUtil.unwrap(getCity())));
        sj.add("stateId = "    + Objects.toString(getStateId()));
        sj.add("zipCode = "    + Objects.toString(getZipCode()));
        sj.add("homePhone = "  + Objects.toString(OptionalUtil.unwrap(getHomePhone())));
        sj.add("cellPhone = "  + Objects.toString(OptionalUtil.unwrap(getCellPhone())));
        sj.add("workPhone = "  + Objects.toString(OptionalUtil.unwrap(getWorkPhone())));
        sj.add("homeEmail = "  + Objects.toString(OptionalUtil.unwrap(getHomeEmail())));
        sj.add("workEmail = "  + Objects.toString(OptionalUtil.unwrap(getWorkEmail())));
        return "AuthorsImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Authors)) { return false; }
        final Authors thatAuthors = (Authors)that;
        if (this.getId() != thatAuthors.getId()) {return false; }
        if (this.getVersion() != thatAuthors.getVersion()) {return false; }
        if (!Objects.equals(this.getPrefix(), thatAuthors.getPrefix())) {return false; }
        if (!Objects.equals(this.getLastName(), thatAuthors.getLastName())) {return false; }
        if (!Objects.equals(this.getFirstName(), thatAuthors.getFirstName())) {return false; }
        if (!Objects.equals(this.getMiddleInit(), thatAuthors.getMiddleInit())) {return false; }
        if (!Objects.equals(this.getSuffix(), thatAuthors.getSuffix())) {return false; }
        if (!Objects.equals(this.getAddress(), thatAuthors.getAddress())) {return false; }
        if (!Objects.equals(this.getCity(), thatAuthors.getCity())) {return false; }
        if (this.getStateId() != thatAuthors.getStateId()) {return false; }
        if (!Objects.equals(this.getZipCode(), thatAuthors.getZipCode())) {return false; }
        if (!Objects.equals(this.getHomePhone(), thatAuthors.getHomePhone())) {return false; }
        if (!Objects.equals(this.getCellPhone(), thatAuthors.getCellPhone())) {return false; }
        if (!Objects.equals(this.getWorkPhone(), thatAuthors.getWorkPhone())) {return false; }
        if (!Objects.equals(this.getHomeEmail(), thatAuthors.getHomeEmail())) {return false; }
        if (!Objects.equals(this.getWorkEmail(), thatAuthors.getWorkEmail())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Long.hashCode(getId());
        hash = 31 * hash + Long.hashCode(getVersion());
        hash = 31 * hash + Objects.hashCode(getPrefix());
        hash = 31 * hash + Objects.hashCode(getLastName());
        hash = 31 * hash + Objects.hashCode(getFirstName());
        hash = 31 * hash + Objects.hashCode(getMiddleInit());
        hash = 31 * hash + Objects.hashCode(getSuffix());
        hash = 31 * hash + Objects.hashCode(getAddress());
        hash = 31 * hash + Objects.hashCode(getCity());
        hash = 31 * hash + Long.hashCode(getStateId());
        hash = 31 * hash + Objects.hashCode(getZipCode());
        hash = 31 * hash + Objects.hashCode(getHomePhone());
        hash = 31 * hash + Objects.hashCode(getCellPhone());
        hash = 31 * hash + Objects.hashCode(getWorkPhone());
        hash = 31 * hash + Objects.hashCode(getHomeEmail());
        hash = 31 * hash + Objects.hashCode(getWorkEmail());
        return hash;
    }
}