package com.practice.check.externalization;/*
 * @author -Suraj Tiwari
 */

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.stream.Collectors;

/**
 * Externalization helps in customization of serialization process.
 * its gives us the flexibility to which fields we can serialize and which not
 *
 * Internaly extenaliztion extends serialable interface
 *
 */

public class Employee implements Externalizable {


    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
out.writeInt(id);
//out.writeObject("Suraj");

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
 id=in.readInt();
 //name=(String) in.readObject();

    }
}
