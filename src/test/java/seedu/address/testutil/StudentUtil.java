package seedu.address.testutil;

import seedu.address.logic.commands.AddStudentCommand;
import seedu.address.logic.commands.EditCommand.EditStudentDescriptor;
import seedu.address.model.student.Student;

import static seedu.address.logic.parser.CliSyntax.*;

/**
 * A utility class for Student.
 */
public class StudentUtil {

    /**
     * Returns an add command string for adding the {@code student}.
     */
    public static String getAddCommand(Student student) {
        return AddStudentCommand.COMMAND_WORD + " " + getPersonDetails(student);
    }

    /**
     * Returns the part of command string for the given {@code student}'s details.
     */
    public static String getPersonDetails(Student student) {
        StringBuilder sb = new StringBuilder();
        sb.append(PREFIX_NAME + student.getName().fullName + " ");
        sb.append(PREFIX_PHONE + student.getPhone().value + " ");
        sb.append(PREFIX_EMAIL + student.getEmail().value + " ");
        sb.append(PREFIX_ADDRESS + student.getAddress().value + " ");
        sb.append(PREFIX_STUDY_LEVEL + student.getStudyLevel() + " ");
        sb.append(PREFIX_GUARDIAN_PHONE + student.getGuardianPhone().value + " ");
        sb.append(PREFIX_RELATIONSHIP + student.getRelationship() + " ");
        return sb.toString();
    }

    /**
     * Returns the part of command string for the given {@code EditStudentDescriptor}'s details.
     */
    public static String getEditPersonDescriptorDetails(EditStudentDescriptor descriptor) {
        StringBuilder sb = new StringBuilder();
        descriptor.getName().ifPresent(name -> sb.append(PREFIX_NAME).append(name.fullName).append(" "));
        descriptor.getPhone().ifPresent(phone -> sb.append(PREFIX_PHONE).append(phone.value).append(" "));
        descriptor.getEmail().ifPresent(email -> sb.append(PREFIX_EMAIL).append(email.value).append(" "));
        descriptor.getAddress().ifPresent(address -> sb.append(PREFIX_ADDRESS).append(address.value).append(" "));
        descriptor.getStudyLevel().ifPresent(studyLevel -> sb.append(PREFIX_STUDY_LEVEL).append(studyLevel).append(" "));
        descriptor.getGuardianPhone().ifPresent(guardianPhone -> sb.append(PREFIX_GUARDIAN_PHONE).append(guardianPhone.value).append(" "));
        descriptor.getRelationship().ifPresent(relationship -> sb.append(PREFIX_RELATIONSHIP).append(relationship).append(" "));
        return sb.toString();
    }
}