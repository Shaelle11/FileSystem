import React from "react";
import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import UploadFiles from "./components/upload-files";

function App() {
  return (
    <div className="container" style={{ width: "600px" }}>
      <div style={{ margin: "20px" }}>
        <h4>File Manager</h4>
      </div>
      <UploadFiles />
    </div>
  );
}
export default App;
