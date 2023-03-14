import NxWelcome from './nx-welcome';

export function App() {
  fetch('http://localhost:8080/api/addresses').then(console.log).catch(console.error);
  return (
    <>
      <NxWelcome title="frontend" />
     </>
  );
}
export default App;
