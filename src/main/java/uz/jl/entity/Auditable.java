package uz.jl.entity;

import lombok.*;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import java.util.Date;

/**
 * @author Bakhromjon Wed, 3:12 PM 1/26/2022
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class Auditable {
    @BsonProperty(value = "_id")
    private ObjectId id;

    private Date createdAt;
}
