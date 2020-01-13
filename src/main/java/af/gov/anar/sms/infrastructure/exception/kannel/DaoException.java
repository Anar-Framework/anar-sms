package af.gov.anar.sms.infrastructure.exception.kannel;


import af.gov.anar.sms.infrastructure.exception.common.BaseCheckedException;

public class DaoException extends BaseCheckedException {

    /**
     * This constructor will take message String as a parameter and called
     * BaseException class message parameter constructor.
     *
     * @param message is the String text or special message given by user.
     */
    public DaoException(String message) {
        super(message);
    }


}