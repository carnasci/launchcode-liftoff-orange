const [user, setuser] = useState({
  id: "",
  username: "",
  password: "",
  itineraries: [],
  reviews: [],
  favorites: [],
});

useEffect(() => {
  const loggedInUser = localStorage.getItem("user");
  if (loggedInUser) {
    const foundUser = JSON.parse(loggedInUser);
    setuser(foundUser);
  }
}, []);

export default function User() {
  return (
    <>
      <div>
        <h2>{user.name}</h2>
      </div>

      <div>
        <div>
          <p>{user.favorites[i].parkCode}</p>
        </div>
      </div>
    </>
  );
}
