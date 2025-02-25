export const LoginInput = ({
    label,
    type = "text",
    placeholder,
    value,
    onChange,
    name,
    show,
    validatortext,
  }) => {
    return (
      <div className="mb-[10px]">
        <label
          htmlFor={name}
          className="block text-[15px] text-[#7C838A] mb-[13px]"
        >
          {label}
        </label>
        <input
          id={name}
          name={name}
          type={type}
          value={value}
          onChange={onChange}
          placeholder={placeholder}
          className="w-[376px] h-[40px] pl-[7px] pb-[6px] border-solid border-1 rounded-lg border-[#D9D9D9] text-[12px] focus:outline-none placeholder-[#B2B2B2]"
        />
        {show? <div className = "text-[10px] text-[#FF595C] font-normal">
          {validatortext}
        </div> : null}
      </div>
    );
  };
